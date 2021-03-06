import org.carlspring.maven.commons.util.ArtifactUtils
import org.carlspring.strongbox.client.ArtifactClient


def artifact = ArtifactUtils.getArtifactFromGAV("org.carlspring.maven:test-project:1.0.8");

def client = ArtifactClient.testInstance;

if (!client.artifactExists(artifact, "storage0", "snapshots"))
{
    System.out.println("The remote (SNAPSHOT) repository successfully declined the deployment of a release artifact.")

    return true;
}

return false;
