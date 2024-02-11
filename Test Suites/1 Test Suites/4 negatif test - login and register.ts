<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>4 negatif test - login and register</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>5182aa11-5a2e-4f47-ba34-a4d544db1c8e</testSuiteGuid>
   <testCaseLink>
      <guid>d15ee633-6cbf-4638-a670-90eabdceeeef</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/2 negative test case/13 create account dengan username sama</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>15240e66-9e32-410e-b56a-3405af78de0f</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/2 negative test case/14 Gagal login (data driven)</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>ca3680b9-f202-47d2-874f-b1e9dd929ee6</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/8 data gagal login</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>ca3680b9-f202-47d2-874f-b1e9dd929ee6</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>username</value>
         <variableId>6dfcd068-e3a6-40b4-a1fe-b12097b05171</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>ca3680b9-f202-47d2-874f-b1e9dd929ee6</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>f29057d4-b0da-439f-8b98-8de283888b1a</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>540fc3e5-8cd7-45ee-a5fe-d9b6aefdcb4e</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/2 negative test case/22 Login or Register Facebook</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
</TestSuiteEntity>
