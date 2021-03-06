package ResourceManager.respository;


import ResourceManager.repository.ProjectRepository;
import ResourceManager.repository.ProjectResourceRepository;
import ResourceManager.repository.ResourceRepository;
import ResourceManager.entity.Project;
import ResourceManager.entity.ProjectResources;
import ResourceManager.entity.Resource;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.time.LocalDate;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ResourceManagerProjectResourceTest {
    @Autowired
    private ProjectResourceRepository projectResource_repository;
    @Autowired
    private ResourceRepository resource_repository;
    @Autowired
    private ProjectRepository project_repository;
    @Test
    public void saveTest(){
        Resource resource=new Resource();
        resource.setResourceId(1);
        resource_repository.save(resource);
        Project project =new Project();
        project.setId(1);
        project_repository.save(project);
        ProjectResources data=new ProjectResources();
        data.setProject(project);
        data.setTime_created(LocalDate.now());
        data.setResource(resource);
        data.setRecord_id(1);
        ProjectResources result=projectResource_repository.save(data);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByIdTest() {
        ProjectResources result=projectResource_repository.findById(1).orElse(null);
        Assert.assertNotNull(result);
    }
    @Test
    public void findAllTest(){
        List<ProjectResources> result=projectResource_repository.findAll();
        Assert.assertEquals(1, result.size());
    }
}
