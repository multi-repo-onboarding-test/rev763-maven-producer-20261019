# Representative access producer for REV-763

This public repository is an isolated synthetic test fixture. It is not JFrog source or a real published package.

This repository produces the Maven artifact `org.example.access:access-client:7.204.2`. Consumers use the AccessClient Java API to validate access tokens. The owning source repository intentionally has a different name from its artifact.

Contract: `AccessClient.isValidToken` returns false for null, blank, or shorter-than-eight-character tokens. This rule is a deterministic E2E fixture, not a security implementation.
