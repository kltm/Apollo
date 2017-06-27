
Feature: Apollo core functionality is okay
 Basic pages and functions that exist no matter what.

 ## No Background necessary.

 Scenario: General help to user guide exists
    Given I go to page "/Apollo-staging/3836/jbrowse/index.html"
     and I click on element "dropdownbutton_help"
     and I click on element "menubar_generalhelp_text"
     then the link "Apollo User Guide" appears in the document
