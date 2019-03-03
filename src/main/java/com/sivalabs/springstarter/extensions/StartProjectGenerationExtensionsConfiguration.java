package com.sivalabs.springstarter.extensions;

import com.sivalabs.springstarter.extensions.docker.DockerProjectGenerationConfiguration;
import io.spring.initializr.generator.project.ProjectGenerationConfiguration;
import io.spring.initializr.generator.spring.build.BuildCustomizer;
import org.springframework.context.annotation.Import;

/**
 * Configuration for {@link BuildCustomizer}s.
 *
 * @author Siva
 */
@ProjectGenerationConfiguration
@Import({ DockerProjectGenerationConfiguration.class })
public class StartProjectGenerationExtensionsConfiguration {

}