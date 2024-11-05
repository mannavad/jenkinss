def call (){
   rtUpload (
    serverId: 'jfrog',
    spec: '''{
          "files": [
            {
              "pattern": "*.jar",
              "target": "libs-snapshot-local"
            }
         ]
    }''',

    // Optional - Associate the uploaded files with the following custom build name and build number,
    // as build artifacts.
    // If not set, the files will be associated with the default build name and build number (i.e the 
    // the Jenkins job name and number).
    buildName: 'holyFrog',
    buildNumber: '42',
    // Optional - Only if this build is associated with a project in Artifactory, set the project key as follows.
    project: 'my-project-key'
)
      }
