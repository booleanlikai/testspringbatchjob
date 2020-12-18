package com.test.testspringbatchjob.configure;



import com.test.testspringbatchjob.model.Person;
import com.test.testspringbatchjob.test1.CreditBill;
import com.test.testspringbatchjob.test1.PersonItemProcessor;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.builder.FlatFileItemWriterBuilder;
import org.springframework.batch.item.file.transform.PassThroughLineAggregator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

@Configuration
@ComponentScan("com.test.testspringbatchjob")
public class conf {


    @Bean
    public PersonItemProcessor processor() {
        return new PersonItemProcessor();
    }


    @Bean
    public FlatFileItemWriter<String> writer() {
        return new FlatFileItemWriterBuilder<String>()
                .name("greetingItemWriter")
                .resource(new FileSystemResource(
                        "target/test-outputs/greetings.txt"))
                .lineAggregator(new PassThroughLineAggregator<>()).build();
    }


    @Bean
    public FlatFileItemReader<CreditBill> reader() {
        return new FlatFileItemReaderBuilder<CreditBill>()
                .name("personItemReader")
                .resource(new ClassPathResource("/test1/data/credit-card-bill-201303.csv"))
                .delimited().names(new String[] {"accountID", "name","amount","date","address"})
                .targetType(CreditBill.class).build();
    }


}
