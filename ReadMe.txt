Step 1: Import postman collection into Postman
1. Open Postman.
2. Click on "Import" in the top left corner.
3. Postman will fetch the postman collection and show you the endpoints. 
4. Click "Import" to add them to your workspace.


Step 2: Run the APIs and Assertions as a Collection in Postman
1. Click on the "Collections" tab, select your collection, and then click on the "Run" button (the play icon).
2. In the Collection Runner, you can choose to run the entire collection and see the results of the assertions for each request.

Step 3: Running Newman Locally
Prerequisites
- Node.js installed on your machine.
- Newman installed globally via npm:
- bash
- npm install -g newman
- Image file should be uploaded locally or in the CI/CD location path and should be used in the postman collection

1. Export your Postman collection:
2. In Postman, go to your collection, click on the three dots (⋮) next to the collection name, and select "Export."
3. Choose the version (usually the latest) and save the JSON file.
4. Run the collection using Newman:
bash
newman run path/to/your-collection.json

Step 4: Integrating with CI/CD
CircleCI:
1. Create a .circleci/config.yml file in your repository

Jenkins:
1. In Jenkins, create a new pipeline job.
2. In the pipeline script, you can use the jenkins.groovy file