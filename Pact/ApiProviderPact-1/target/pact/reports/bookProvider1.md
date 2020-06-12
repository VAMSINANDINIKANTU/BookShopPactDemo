# bookProvider1

| Description    | Value |
| -------------- | ----- |
| Date Generated | Mon Jun 08 17:45:17 IST 2020 |
| Pact Version   | 3.6.14 |

## Verifying a pact between _myconsumer1_ and _bookProvider1_

Given **SomeState**  
get Book data that was not in provider  
&nbsp;&nbsp;returns a response which  
&nbsp;&nbsp;&nbsp;&nbsp;has status code **200** (<span style='color:red'>FAILED</span>)

```
expected status of 200 but was 404
```

&nbsp;&nbsp;&nbsp;&nbsp;has a matching body (<span style='color:red'>FAILED</span>)  

| Path | Failure |
| ---- | ------- |
|$|Expected bookName='C++' but was missing; Expected bookPrice='324' but was missing; Expected publisherName='Manoj' but was missing; Expected publishingYear=2001 but was missing|

Diff:

```diff
{
-    "bookName": "C++",
-    "bookPrice": "324",
-    "publisherName": "Manoj",
-    "publishingYear": 2001
+    "timestamp": "2020-06-08T12:15:19.383+0000",
+    "status": 404,
+    "error": "Not Found",
+    "message": "No message available",
+    "path": "/bookshopmaintenanceapplication/api/book/1"
}
```


# bookProvider1

| Description    | Value |
| -------------- | ----- |
| Date Generated | Mon Jun 08 17:45:21 IST 2020 |
| Pact Version   | 3.6.14 |

## Verifying a pact between _myconsumer1_ and _bookProvider1_

get Book data  
&nbsp;&nbsp;returns a response which  
&nbsp;&nbsp;&nbsp;&nbsp;has status code **200** (<span style='color:green'>OK</span>)  
&nbsp;&nbsp;&nbsp;&nbsp;has a matching body (<span style='color:red'>FAILED</span>)  

| Path | Failure |
| ---- | ------- |
|$.bookPrice|Expected '498' but received 498.0|

Diff:

```diff
{
+    "id": 7,
    "bookName": "Head First Java",
-    "bookPrice": "498",
+    "bookPrice": 498.0,
    "publisherName": "Raj",
```


# bookProvider1

| Description    | Value |
| -------------- | ----- |
| Date Generated | Wed Jun 10 11:25:00 IST 2020 |
| Pact Version   | 3.6.14 |

## Verifying a pact between _myconsumer1_ and _bookProvider1_

Given **SomeState**  
get Book data that was not in provider  
&nbsp;&nbsp;returns a response which  
&nbsp;&nbsp;&nbsp;&nbsp;has status code **200** (<span style='color:red'>FAILED</span>)

```
expected status of 200 but was 404
```

&nbsp;&nbsp;&nbsp;&nbsp;has a matching body (<span style='color:red'>FAILED</span>)  

| Path | Failure |
| ---- | ------- |
|$|Expected bookName='C++' but was missing; Expected bookPrice='324' but was missing; Expected publisherName='Manoj' but was missing; Expected publishingYear=2001 but was missing|

Diff:

```diff
{
-    "bookName": "C++",
-    "bookPrice": "324",
-    "publisherName": "Manoj",
-    "publishingYear": 2001
+    "timestamp": "2020-06-10T05:55:01.606+0000",
+    "status": 404,
+    "error": "Not Found",
+    "message": "No message available",
+    "path": "/bookshopmaintenanceapplication/api/book/1"
}
```


# bookProvider1

| Description    | Value |
| -------------- | ----- |
| Date Generated | Wed Jun 10 11:25:02 IST 2020 |
| Pact Version   | 3.6.14 |

## Verifying a pact between _myconsumer1_ and _bookProvider1_

get Book data  
&nbsp;&nbsp;returns a response which  
&nbsp;&nbsp;&nbsp;&nbsp;has status code **200** (<span style='color:green'>OK</span>)  
&nbsp;&nbsp;&nbsp;&nbsp;has a matching body (<span style='color:red'>FAILED</span>)  

| Path | Failure |
| ---- | ------- |
|$.bookPrice|Expected '498' but received 498.0|

Diff:

```diff
{
+    "id": 7,
    "bookName": "Head First Java",
-    "bookPrice": "498",
+    "bookPrice": 498.0,
    "publisherName": "Raj",
```


# bookProvider1

| Description    | Value |
| -------------- | ----- |
| Date Generated | Wed Jun 10 11:40:41 IST 2020 |
| Pact Version   | 3.6.14 |

## Verifying a pact between _myconsumer1_ and _bookProvider1_

Given **SomeState**  
get Book data that was not in provider  
&nbsp;&nbsp;returns a response which  
&nbsp;&nbsp;&nbsp;&nbsp;has status code **200** (<span style='color:red'>FAILED</span>)

```
expected status of 200 but was 404
```

&nbsp;&nbsp;&nbsp;&nbsp;has a matching body (<span style='color:red'>FAILED</span>)  

| Path | Failure |
| ---- | ------- |
|$|Expected bookName='C++' but was missing; Expected bookPrice='324' but was missing; Expected publisherName='Manoj' but was missing; Expected publishingYear=2001 but was missing|

Diff:

```diff
{
-    "bookName": "C++",
-    "bookPrice": "324",
-    "publisherName": "Manoj",
-    "publishingYear": 2001
+    "timestamp": "2020-06-10T06:10:42.085+0000",
+    "status": 404,
+    "error": "Not Found",
+    "message": "No message available",
+    "path": "/bookshopmaintenanceapplication/api/book/1"
}
```


# bookProvider1

| Description    | Value |
| -------------- | ----- |
| Date Generated | Wed Jun 10 11:40:43 IST 2020 |
| Pact Version   | 3.6.14 |

## Verifying a pact between _myconsumer1_ and _bookProvider1_

get Book data  
&nbsp;&nbsp;returns a response which  
&nbsp;&nbsp;&nbsp;&nbsp;has status code **200** (<span style='color:green'>OK</span>)  
&nbsp;&nbsp;&nbsp;&nbsp;has a matching body (<span style='color:red'>FAILED</span>)  

| Path | Failure |
| ---- | ------- |
|$.bookPrice|Expected '498' but received 498.0|

Diff:

```diff
{
+    "id": 7,
    "bookName": "Head First Java",
-    "bookPrice": "498",
+    "bookPrice": 498.0,
    "publisherName": "Raj",
```


# bookProvider1

| Description    | Value |
| -------------- | ----- |
| Date Generated | Wed Jun 10 11:57:15 IST 2020 |
| Pact Version   | 3.6.14 |

## Verifying a pact between _myconsumer1_ and _bookProvider1_

Given **SomeState**  
get Book data that was not in provider  
&nbsp;&nbsp;returns a response which  
&nbsp;&nbsp;&nbsp;&nbsp;has status code **200** (<span style='color:red'>FAILED</span>)

```
expected status of 200 but was 404
```

&nbsp;&nbsp;&nbsp;&nbsp;has a matching body (<span style='color:red'>FAILED</span>)  

| Path | Failure |
| ---- | ------- |
|$|Expected bookName='C++' but was missing; Expected bookPrice='324' but was missing; Expected publisherName='Manoj' but was missing; Expected publishingYear=2001 but was missing|

Diff:

```diff
{
-    "bookName": "C++",
-    "bookPrice": "324",
-    "publisherName": "Manoj",
-    "publishingYear": 2001
+    "timestamp": "2020-06-10T06:27:15.874+0000",
+    "status": 404,
+    "error": "Not Found",
+    "message": "No message available",
+    "path": "/bookshopmaintenanceapplication/api/book/1"
}
```


# bookProvider1

| Description    | Value |
| -------------- | ----- |
| Date Generated | Wed Jun 10 11:57:16 IST 2020 |
| Pact Version   | 3.6.14 |

## Verifying a pact between _myconsumer1_ and _bookProvider1_

get Book data  
&nbsp;&nbsp;returns a response which  
&nbsp;&nbsp;&nbsp;&nbsp;has status code **200** (<span style='color:green'>OK</span>)  
&nbsp;&nbsp;&nbsp;&nbsp;has a matching body (<span style='color:red'>FAILED</span>)  

| Path | Failure |
| ---- | ------- |
|$.bookPrice|Expected '498' but received 498.0|

Diff:

```diff
{
+    "id": 7,
    "bookName": "Head First Java",
-    "bookPrice": "498",
+    "bookPrice": 498.0,
    "publisherName": "Raj",
```


# bookProvider1

| Description    | Value |
| -------------- | ----- |
| Date Generated | Wed Jun 10 12:09:41 IST 2020 |
| Pact Version   | 3.6.14 |

## Verifying a pact between _myconsumer1_ and _bookProvider1_

Given **SomeState**  
get Book data that was not in provider  
&nbsp;&nbsp;returns a response which  
&nbsp;&nbsp;&nbsp;&nbsp;has status code **200** (<span style='color:red'>FAILED</span>)

```
expected status of 200 but was 404
```

&nbsp;&nbsp;&nbsp;&nbsp;has a matching body (<span style='color:red'>FAILED</span>)  

| Path | Failure |
| ---- | ------- |
|$|Expected bookName='C++' but was missing; Expected bookPrice='324' but was missing; Expected publisherName='Manoj' but was missing; Expected publishingYear=2001 but was missing|

Diff:

```diff
{
-    "bookName": "C++",
-    "bookPrice": "324",
-    "publisherName": "Manoj",
-    "publishingYear": 2001
+    "timestamp": "2020-06-10T06:39:42.382+0000",
+    "status": 404,
+    "error": "Not Found",
+    "message": "No message available",
+    "path": "/bookshopmaintenanceapplication/api/book/1"
}
```


# bookProvider1

| Description    | Value |
| -------------- | ----- |
| Date Generated | Wed Jun 10 12:09:44 IST 2020 |
| Pact Version   | 3.6.14 |

## Verifying a pact between _myconsumer1_ and _bookProvider1_

get Book data  
&nbsp;&nbsp;returns a response which  
&nbsp;&nbsp;&nbsp;&nbsp;has status code **200** (<span style='color:green'>OK</span>)  
&nbsp;&nbsp;&nbsp;&nbsp;has a matching body (<span style='color:red'>FAILED</span>)  

| Path | Failure |
| ---- | ------- |
|$.bookPrice|Expected '498' but received 498.0|

Diff:

```diff
{
+    "id": 7,
    "bookName": "Head First Java",
-    "bookPrice": "498",
+    "bookPrice": 498.0,
    "publisherName": "Raj",
```


# bookProvider1

| Description    | Value |
| -------------- | ----- |
| Date Generated | Thu Jun 11 15:13:52 IST 2020 |
| Pact Version   | 3.6.14 |

## Verifying a pact between _myconsumer1_ and _bookProvider1_

Given **SomeState**  
get Book data that was not in provider  
&nbsp;&nbsp;returns a response which  
&nbsp;&nbsp;&nbsp;&nbsp;has status code **200** (<span style='color:red'>FAILED</span>)

```
expected status of 200 but was 404
```

&nbsp;&nbsp;&nbsp;&nbsp;has a matching body (<span style='color:red'>FAILED</span>)  

| Path | Failure |
| ---- | ------- |
|$|Expected bookName='C++' but was missing; Expected bookPrice='324' but was missing; Expected publisherName='Manoj' but was missing; Expected publishingYear=2001 but was missing|

Diff:

```diff
{
-    "bookName": "C++",
-    "bookPrice": "324",
-    "publisherName": "Manoj",
-    "publishingYear": 2001
+    "timestamp": "2020-06-11T09:43:53.674+0000",
+    "status": 404,
+    "error": "Not Found",
+    "message": "No message available",
+    "path": "/bookshopmaintenanceapplication/api/book/1"
}
```


# bookProvider1

| Description    | Value |
| -------------- | ----- |
| Date Generated | Thu Jun 11 15:13:54 IST 2020 |
| Pact Version   | 3.6.14 |

## Verifying a pact between _myconsumer1_ and _bookProvider1_

get Book data  
&nbsp;&nbsp;returns a response which  
&nbsp;&nbsp;&nbsp;&nbsp;has status code **200** (<span style='color:green'>OK</span>)  
&nbsp;&nbsp;&nbsp;&nbsp;has a matching body (<span style='color:red'>FAILED</span>)  

| Path | Failure |
| ---- | ------- |
|$.bookPrice|Expected '498' but received 498.0|

Diff:

```diff
{
+    "id": 7,
    "bookName": "Head First Java",
-    "bookPrice": "498",
+    "bookPrice": 498.0,
    "publisherName": "Raj",
```


# bookProvider1

| Description    | Value |
| -------------- | ----- |
| Date Generated | Thu Jun 11 15:27:07 IST 2020 |
| Pact Version   | 3.6.14 |

## Verifying a pact between _myconsumer1_ and _bookProvider1_

Given **SomeState**  
get Book data that was not in provider  
&nbsp;&nbsp;returns a response which  
&nbsp;&nbsp;&nbsp;&nbsp;has status code **200** (<span style='color:red'>FAILED</span>)

```
expected status of 200 but was 404
```

&nbsp;&nbsp;&nbsp;&nbsp;has a matching body (<span style='color:red'>FAILED</span>)  

| Path | Failure |
| ---- | ------- |
|$|Expected bookName='C++' but was missing; Expected bookPrice='324' but was missing; Expected publisherName='Manoj' but was missing; Expected publishingYear=2001 but was missing|

Diff:

```diff
{
-    "bookName": "C++",
-    "bookPrice": "324",
-    "publisherName": "Manoj",
-    "publishingYear": 2001
+    "timestamp": "2020-06-11T09:57:07.880+0000",
+    "status": 404,
+    "error": "Not Found",
+    "message": "No message available",
+    "path": "/bookshopmaintenanceapplication/api/book/1"
}
```


# bookProvider1

| Description    | Value |
| -------------- | ----- |
| Date Generated | Thu Jun 11 15:27:09 IST 2020 |
| Pact Version   | 3.6.14 |

## Verifying a pact between _myconsumer1_ and _bookProvider1_

get Book data  
&nbsp;&nbsp;returns a response which  
&nbsp;&nbsp;&nbsp;&nbsp;has status code **200** (<span style='color:green'>OK</span>)  
&nbsp;&nbsp;&nbsp;&nbsp;has a matching body (<span style='color:red'>FAILED</span>)  

| Path | Failure |
| ---- | ------- |
|$.bookPrice|Expected '498' but received 498.0|

Diff:

```diff
{
+    "id": 7,
    "bookName": "Head First Java",
-    "bookPrice": "498",
+    "bookPrice": 498.0,
    "publisherName": "Raj",
```


# bookProvider1

| Description    | Value |
| -------------- | ----- |
| Date Generated | Thu Jun 11 15:47:00 IST 2020 |
| Pact Version   | 3.6.14 |

## Verifying a pact between _myconsumer1_ and _bookProvider1_

Given **SomeState**  
get Book data that was not in provider  
&nbsp;&nbsp;returns a response which  
&nbsp;&nbsp;&nbsp;&nbsp;has status code **200** (<span style='color:red'>FAILED</span>)

```
expected status of 200 but was 404
```

&nbsp;&nbsp;&nbsp;&nbsp;has a matching body (<span style='color:red'>FAILED</span>)  

| Path | Failure |
| ---- | ------- |
|$|Expected bookName='C++' but was missing; Expected bookPrice='324' but was missing; Expected publisherName='Manoj' but was missing; Expected publishingYear=2001 but was missing|

Diff:

```diff
{
-    "bookName": "C++",
-    "bookPrice": "324",
-    "publisherName": "Manoj",
-    "publishingYear": 2001
+    "timestamp": "2020-06-11T10:17:00.971+0000",
+    "status": 404,
+    "error": "Not Found",
+    "message": "No message available",
+    "path": "/bookshopmaintenanceapplication/api/book/1"
}
```


# bookProvider1

| Description    | Value |
| -------------- | ----- |
| Date Generated | Thu Jun 11 15:47:02 IST 2020 |
| Pact Version   | 3.6.14 |

## Verifying a pact between _myconsumer1_ and _bookProvider1_

get Book data  
&nbsp;&nbsp;returns a response which  
&nbsp;&nbsp;&nbsp;&nbsp;has status code **200** (<span style='color:green'>OK</span>)  
&nbsp;&nbsp;&nbsp;&nbsp;has a matching body (<span style='color:red'>FAILED</span>)  

| Path | Failure |
| ---- | ------- |
|$.bookPrice|Expected '498' but received 498.0|

Diff:

```diff
{
+    "id": 7,
    "bookName": "Head First Java",
-    "bookPrice": "498",
+    "bookPrice": 498.0,
    "publisherName": "Raj",
```


# bookProvider1

| Description    | Value |
| -------------- | ----- |
| Date Generated | 2020-06-11T16:15:44.833+05:30[Asia/Calcutta] |
| Pact Version   | 4.0.0 |
## Verifying a pact between _myconsumer1_ and _bookProvider1_

Given **SomeState**  
get Book data that was not in provider  
&nbsp;&nbsp;returns a response which  
&nbsp;&nbsp;&nbsp;&nbsp;has status code **200** (<span style='color:red'>FAILED</span>)

```
expected status of 200 but was 404
```

&nbsp;&nbsp;&nbsp;&nbsp;has a matching body (<span style='color:red'>FAILED</span>)  

| Path | Failure |
| ---- | ------- |
|$|null|

# bookProvider1

| Description    | Value |
| -------------- | ----- |
| Date Generated | 2020-06-11T16:15:46.819+05:30[Asia/Calcutta] |
| Pact Version   | 4.0.0 |
## Verifying a pact between _myconsumer1_ and _bookProvider1_

get Book data  
&nbsp;&nbsp;returns a response which  
&nbsp;&nbsp;&nbsp;&nbsp;has status code **200** (<span style='color:green'>OK</span>)  
&nbsp;&nbsp;&nbsp;&nbsp;has a matching body (<span style='color:red'>FAILED</span>)  

| Path | Failure |
| ---- | ------- |
|$|null|

