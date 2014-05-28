
import java.io.File;
import java.net.URL;

import org.mybatis.generator.api.ShellRunner;

public class DaoGenerator {

	public static void main(String[] args) {

        String mainPath = "/home/hadoop/IdeaProjects/fj-uni/mybatis-generator-core-pagesupport";

		String gen_dev= mainPath + "/src/test/resources/generatorConfig-mysql.xml";
		
		ShellRunner.main(new String[]{"-configfile", gen_dev, "-overwrite"});
	}

}
