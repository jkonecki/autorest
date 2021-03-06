AutoRest: Python Client Runtime - Azure Module
===============================================


Installation
------------

To install:

.. code-block:: bash

    $ pip install msrestazure


Release History
---------------

2016-03-25 Version 0.2.0
++++++++++++++++++++++++

Update msrest dependency to 0.2.0

**Behaviour change**

- async methods called with raw=True don't return anymore AzureOperationPoller but ClientRawResponse
- Needs Autorest > 0.16.0 Nightly 20160324


2016-03-21 Version 0.1.2
++++++++++++++++++++++++

Update msrest dependency to 0.1.3

**Bugfixes**

- AzureOperationPoller.wait() failed to raise exception if query error (https://github.com/Azure/autorest/pull/856)


2016-03-04 Version 0.1.1
++++++++++++++++++++++++

**Bugfixes**

- Source package corrupted in Pypi (https://github.com/Azure/autorest/issues/799)

2016-03-04 Version 0.1.0
++++++++++++++++++++++++

**Behaviour change**

- Replaced _required attribute in CloudErrorData class with _validation dict.

2016-02-29 Version 0.0.2
++++++++++++++++++++++++

**Bugfixes**

- Fixed AAD bug to include connection verification in UserPassCredentials. (https://github.com/Azure/autorest/pull/725)
- Source package corrupted in Pypi (https://github.com/Azure/autorest/issues/718)

2016-02-19 Version 0.0.1
++++++++++++++++++++++++

- Initial release.
