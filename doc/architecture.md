# Proposed Architecture (for discussion)
Here are some initial thoughts on architecture. They are all open for discussion.
Initial delivery may only support one architecture choice where there are multiple,
 viable options.

## Mobile Application(s)
* Om?
* Android (Java)
* IOS (Swfit)

## Web Application
* Om

## Verification
* block chain
### candidates

### voters
* voter registration by address & date?
* voter email address(es)
#### how many voters per address?
#### local voter laws
* educate based on voter law eligibility

### Constituent
* voting
* authoring

### Incumbent
* positions
* position voting (bills, ordinance, etc)
* authoring

## API Management
How to provide public and internal access to the platform.

### Public
* candidate and public office to campaign for
* raw data for position matrix
* raw data for virtual forms/channels/chats
* for scheduled public and private events

### Private
* mobile application support
* internal data analytics (sentiment, etc)

## Caching
* Redis

## Database
* Cassandra?
* Datomic?
* Postresql?

## Chat & Forum
* Slack?
* Jabber/XMPP?
* Hipchat?

## Monitoring
* Riemann?
* Prometheus?

## Logging
* Schema definition?
* Kafka?

## Analytics
* todo (Flink/Spark/etc)
* Hadoop cluster

## Social Media
* name your poison (wait, would this app be considered social media ;-)

## Server
* Docker containers & Swarm?
* Ansible & Nixos?

## Hosting
* Google Compute Engine?
* Digital Ocean?