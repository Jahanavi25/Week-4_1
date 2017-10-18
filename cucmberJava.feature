Feature: audition

Scenario: Performer telling his id number
Given Performer
When Asked to audition
Then 324-performer

Given Dancer
When Asked to audition
Then tap-772-dancer

Given Vocalist
When Asked to audition
Then I sing in the key of -G-1191

Given Vocalist
When Asked to audition at volume 7
Then I sing in the key of -G-at the volume 7-1191

Given Audition
When I request an audition with 4 performers
Then I expect to see 4 performances