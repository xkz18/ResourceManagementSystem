package ResourceManager.Service;

import ResourceManager.entity.*;

import java.util.List;

public interface ProjectResourceService {
    public ProjectResources addProjectResource(Project project, Resource resource);
    public ProjectResources deleteProjectResource(Integer record_id);
    public ProjectResources getProjectResourceById(Integer record_id);
    public List<ProjectResources> getAllProjectResources();
    public ProjectResources save(ProjectResources projectResource);
    public List<ProjectResources> findByProject(Project project);
    public List<ProjectResources> findByResource(Resource resource);
}
