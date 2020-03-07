package snippet;

public class Snippet {
	public static void main(String[] args) {
		
			<properties>
				<maven.compiler.source>1.8</maven.compiler.source>
				<maven.compiler.target>1.8</maven.compiler.target>
			</properties>
		
		
			<dependencies>
		
				<!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml -->
				<dependency>
					<groupId>org.apache.poi</groupId>
					<artifactId>poi-ooxml</artifactId>
					<version>4.1.0</version>
				</dependency>
		
				<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
				<dependency>
					<groupId>org.seleniumhq.selenium</groupId>
					<artifactId>selenium-java</artifactId>
					<version>3.141.59</version>
				</dependency>
		
				<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-junit -->
				<dependency>
					<groupId>io.cucumber</groupId>
					<artifactId>cucumber-junit</artifactId>
					<version>4.3.0</version>
					<scope>test</scope>
				</dependency>
		
				<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-java -->
				<dependency>
					<groupId>io.cucumber</groupId>
					<artifactId>cucumber-java</artifactId>
					<version>4.3.0</version>
				</dependency>
		
				<!-- https://mvnrepository.com/artifact/commons-io/commons-io -->
				<dependency>
					<groupId>commons-io</groupId>
					<artifactId>commons-io</artifactId>
					<version>2.6</version>
				</dependency>
		
				<!-- https://mvnrepository.com/artifact/io.rest-assured/rest-assured -->
				<dependency>
					<groupId>io.rest-assured</groupId>
					<artifactId>rest-assured</artifactId>
					<version>4.2.0</version>
					<scope>test</scope>
				</dependency>
		
		
			</dependencies>
			<build>
				<plugins>
					<plugin>
						<groupId>org.apache.maven.plugins</groupId>
						<artifactId>maven-surefire-plugin</artifactId>
						<version>3.0.0-M4</version>
						<configuration>
							<includes>
								<include>**/*TestingRunner.java</include>
							</includes>
						</configuration>
					</plugin>
					<plugin>
						<groupId>net.masterthought</groupId>
						<artifactId>maven-cucumber-reporting</artifactId>
						<version>5.0.0</version>
						<executions>
							<execution>
								<id>execution</id>
								<phase>test</phase>
								<goals>
									<goal>generate</goal>
								</goals>
								<configuration>
									<projectName>HrmsCucumberFramework</projectName>
									<!-- output directory for the generated report -->
									<outputDirectory>${project.build.directory}</outputDirectory>
									<!-- optional, defaults to outputDirectory if not specified -->
									<inputDirectory>${project.build.directory}</inputDirectory>
									<jsonFiles>
										<!-- supports wildcard or name pattern -->
										<param>**/*.json</param>
									</jsonFiles>
								</configuration>
							</execution>
						</executions>
					</plugin>
				</plugins>
			</build>
		
		</project>
	}
}

