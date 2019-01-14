"# TratamentoErroVeolia" 

400 Bad Request
The server cannot or will not process the request due to an apparent client error (e.g., malformed request syntax, size too large, invalid request message framing, or deceptive request routing).[33]
401 Unauthorized (RFC 7235)
Similar to 403 Forbidden, but specifically for use when authentication is required and has failed or has not yet been provided. The response must include a WWW-Authenticate header field containing a challenge applicable to the requested resource. See Basic access authentication and Digest access authentication.[34] 401 semantically means "unauthenticated",[35] i.e. the user does not have the necessary credentials.
Note: Some sites incorrectly issue HTTP 401 when an IP address is banned from the website (usually the website domain) and that specific address is refused permission to access a website.
402 Payment Required
Reserved for future use. The original intention was that this code might be used as part of some form of digital cash or micropayment scheme, as proposed for example by GNU Taler[36], but that has not yet happened, and this code is not usually used. Google Developers API uses this status if a particular developer has exceeded the daily limit on requests.[37] Sipgate uses this code if an account does not have sufficient funds to start a call.[38] Shopify uses this code when the store has not paid their fees and is temporarily disabled. [39]
403 Forbidden
The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource, or may need an account of some sort.
404 Not Found
The requested resource could not be found but may be available in the future. Subsequent requests by the client are permissible.
405 Method Not Allowed
A request method is not supported for the requested resource; for example, a GET request on a form that requires data to be presented via POST, or a PUT request on a read-only resource.
406 Not Acceptable
The requested resource is capable of generating only content not acceptable according to the Accept headers sent in the request.[40] See Content negotiation.
407 Proxy Authentication Required (RFC 7235)
The client must first authenticate itself with the proxy.[41]
408 Request Timeout
The server timed out waiting for the request. According to HTTP specifications: "The client did not produce a request within the time that the server was prepared to wait. The client MAY repeat the request without modifications at any later time."[42]
409 Conflict
Indicates that the request could not be processed because of conflict in the current state of the resource, such as an edit conflict between multiple simultaneous updates.
410 Gone
Indicates that the resource requested is no longer available and will not be available again. This should be used when a resource has been intentionally removed and the resource should be purged. Upon receiving a 410 status code, the client should not request the resource in the future. Clients such as search engines should remove the resource from their indices.[43] Most use cases do not require clients and search engines to purge the resource, and a "404 Not Found" may be used instead.
411 Length Required
The request did not specify the length of its content, which is required by the requested resource.[44]
412 Precondition Failed (RFC 7232)
The server does not meet one of the preconditions that the requester put on the request.[45]
413 Payload Too Large (RFC 7231)
The request is larger than the server is willing or able to process. Previously called "Request Entity Too Large".[46]
414 URI Too Long (RFC 7231)
The URI provided was too long for the server to process. Often the result of too much data being encoded as a query-string of a GET request, in which case it should be converted to a POST request.[47] Called "Request-URI Too Long" previously.[48]
415 Unsupported Media Type
The request entity has a media type which the server or resource does not support. For example, the client uploads an image as image/svg+xml, but the server requires that images use a different format.
416 Range Not Satisfiable (RFC 7233)
The client has asked for a portion of the file (byte serving), but the server cannot supply that portion. For example, if the client asked for a part of the file that lies beyond the end of the file.[49] Called "Requested Range Not Satisfiable" previously.[50]
417 Expectation Failed
The server cannot meet the requirements of the Expect request-header field.[51]
418 I'm a teapot (RFC 2324, RFC 7168)
This code was defined in 1998 as one of the traditional IETF April Fools' jokes, in RFC 2324, Hyper Text Coffee Pot Control Protocol, and is not expected to be implemented by actual HTTP servers. The RFC specifies this code should be returned by teapots requested to brew coffee.[52] This HTTP status is used as an Easter egg in some websites, including Google.com.[53][54]
421 Misdirected Request (RFC 7540)
The request was directed at a server that is not able to produce a response[55] (for example because of connection reuse).[56]
422 Unprocessable Entity (WebDAV; RFC 4918)
The request was well-formed but was unable to be followed due to semantic errors.[17]
423 Locked (WebDAV; RFC 4918)
The resource that is being accessed is locked.[17]
424 Failed Dependency (WebDAV; RFC 4918)
The request failed because it depended on another request and that request failed (e.g., a PROPPATCH).[17]
426 Upgrade Required
The client should switch to a different protocol such as TLS/1.0, given in the Upgrade header field.[57]
428 Precondition Required (RFC 6585)
The origin server requires the request to be conditional. Intended to prevent the 'lost update' problem, where a client GETs a resource's state, modifies it, and PUTs it back to the server, when meanwhile a third party has modified the state on the server, leading to a conflict."[58]
429 Too Many Requests (RFC 6585)
The user has sent too many requests in a given amount of time. Intended for use with rate-limiting schemes.[58]
431 Request Header Fields Too Large (RFC 6585)
The server is unwilling to process the request because either an individual header field, or all the header fields collectively, are too large.[58]
451 Unavailable For Legal Reasons (RFC 7725)
A server operator has received a legal demand to deny access to a resource or to a set of resources that includes the requested resource.[59] The code 451 was chosen as a reference to the novel Fahrenheit 451 (see the Acknowledgements in the RFC).
5xx Server errors
The server failed to fulfil a request.[60]

Response status codes beginning with the digit "5" indicate cases in which the server is aware that it has encountered an error or is otherwise incapable of performing the request. Except when responding to a HEAD request, the server should include an entity containing an explanation of the error situation, and indicate whether it is a temporary or permanent condition. Likewise, user agents should display any included entity to the user. These response codes are applicable to any request method.[61]

500 Internal Server Error
A generic error message, given when an unexpected condition was encountered and no more specific message is suitable.[62]
501 Not Implemented
The server either does not recognize the request method, or it lacks the ability to fulfil the request. Usually this implies future availability (e.g., a new feature of a web-service API).[63]
502 Bad Gateway
The server was acting as a gateway or proxy and received an invalid response from the upstream server.[64]
503 Service Unavailable
The server is currently unavailable (because it is overloaded or down for maintenance). Generally, this is a temporary state.[65]
504 Gateway Timeout
The server was acting as a gateway or proxy and did not receive a timely response from the upstream server.[66]
505 HTTP Version Not Supported
The server does not support the HTTP protocol version used in the request.[67]
506 Variant Also Negotiates (RFC 2295)
Transparent content negotiation for the request results in a circular reference.[68]
507 Insufficient Storage (WebDAV; RFC 4918)
The server is unable to store the representation needed to complete the request.[17]
508 Loop Detected (WebDAV; RFC 5842)
The server detected an infinite loop while processing the request (sent instead of 208 Already Reported).
510 Not Extended (RFC 2774)
Further extensions to the request are required for the server to fulfil it.[69]
511 Network Authentication Required (RFC 6585)
The client needs to authenticate to gain network access. Intended for use by intercepting proxies used to control access to the network (e.g., "captive portals" used to require agreement to Terms of Service before granting full Internet access via a Wi-Fi hotspot).[58]
Unofficial codes
The following codes are not specified by any standard.

103 Checkpoint
Used in the resumable requests proposal to resume aborted PUT or POST requests.[70]
218 This is fine (Apache Web Server)
Used as a catch-all error condition for allowing response bodies to flow through Apache when ProxyErrorOverride is enabled. When ProxyErrorOverride is enabled in Apache, response bodies that contain a status code of 4xx or 5xx are automatically discarded by Apache in favor of a generic response or a custom response specified by the ErrorDocument directive.[71]
419 Page Expired (Laravel Framework)
Used by the Laravel Framework when a CSRF Token is missing or expired.
420 Method Failure (Spring Framework)
A deprecated response used by the Spring Framework when a method has failed.[72]
420 Enhance Your Calm (Twitter)
Returned by version 1 of the Twitter Search and Trends API when the client is being rate limited; versions 1.1 and later use the 429 Too Many Requests response code instead.[73]
450 Blocked by Windows Parental Controls (Microsoft)
The Microsoft extension code indicated when Windows Parental Controls are turned on and are blocking access to the requested webpage.[74]
498 Invalid Token (Esri)
Returned by ArcGIS for Server. Code 498 indicates an expired or otherwise invalid token.[75]
499 Token Required (Esri)
Returned by ArcGIS for Server. Code 499 indicates that a token is required but was not submitted.[75]
509 Bandwidth Limit Exceeded (Apache Web Server/cPanel)
The server has exceeded the bandwidth specified by the server administrator; this is often used by shared hosting providers to limit the bandwidth of customers.[76]
526 Invalid SSL Certificate
Used by Cloudflare and Cloud Foundry's gorouter to indicate failure to validate the SSL/TLS certificate that the origin server presented.
530 Site is frozen
Used by the Pantheon web platform to indicate a site that has been frozen due to inactivity.[77]
598 (Informal convention) Network read timeout error
Used by some HTTP proxies to signal a network read timeout behind the proxy to a client in front of the proxy.[78]
Internet Information Services
Microsoft's Internet Information Services web server expands the 4xx error space to signal errors with the client's request.

440 Login Time-out
The client's session has expired and must log in again.[79]
449 Retry With
The server cannot honour the request because the user has not provided the required information.[80]
451 Redirect
Used in Exchange ActiveSync when either a more efficient server is available or the server cannot access the users' mailbox.[81] The client is expected to re-run the HTTP AutoDiscover operation to find a more appropriate server.[82]
nginx
The nginx web server software expands the 4xx error space to signal issues with the client's request.[83][84]

444 No Response
Used internally[85] to instruct the server to return no information to the client and close the connection immediately.
494 Request header too large
Client sent too large request or too long header line.
495 SSL Certificate Error
An expansion of the 400 Bad Request response code, used when the client has provided an invalid client certificate.
496 SSL Certificate Required
An expansion of the 400 Bad Request response code, used when a client certificate is required but not provided.
497 HTTP Request Sent to HTTPS Port
An expansion of the 400 Bad Request response code, used when the client has made a HTTP request to a port listening for HTTPS requests.
499 Client Closed Request
Used when the client has closed the request before the server could send a response.
Cloudflare
Cloudflare's reverse proxy service expands the 5xx series of errors space to signal issues with the origin server.[86]

520 Unknown Error
The 520 error is used as a "catch-all response for when the origin server returns something unexpected", listing connection resets, large headers, and empty or invalid responses as common triggers.
521 Web Server Is Down
The origin server has refused the connection from Cloudflare.
522 Connection Timed Out
Cloudflare could not negotiate a TCP handshake with the origin server.
523 Origin Is Unreachable
Cloudflare could not reach the origin server; for example, if the DNS records for the origin server are incorrect.
524 A Timeout Occurred
Cloudflare was able to complete a TCP connection to the origin server, but did not receive a timely HTTP response.
525 SSL Handshake Failed
Cloudflare could not negotiate a SSL/TLS handshake with the origin server.
526 Invalid SSL Certificate
Cloudflare could not validate the SSL certificate on the origin web server.
527 Railgun Error
Error 527 indicates that the request timed out or failed after the WAN connection had been established.[87]
530 Origin DNS Error
Error 530 indicates that the requested host name could not be resolved on the Cloudflare network to an origin server.[88]
