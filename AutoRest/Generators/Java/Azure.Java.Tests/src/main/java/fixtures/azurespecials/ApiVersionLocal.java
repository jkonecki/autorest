/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azurespecials;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponseCallback;
import retrofit.client.Response;
import retrofit.http.GET;
import retrofit.http.Query;
import retrofit.http.Header;

/**
 * An instance of this class provides access to all the operations defined
 * in ApiVersionLocal.
 */
public interface ApiVersionLocal {
    /**
     * The interface defining all the services for ApiVersionLocal to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ApiVersionLocalService {
        @GET("/azurespecials/apiVersion/method/string/none/query/local/2.0")
        Response getMethodLocalValid(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage) throws ServiceException;

        @GET("/azurespecials/apiVersion/method/string/none/query/local/2.0")
        void getMethodLocalValidAsync(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, ServiceResponseCallback cb);

        @GET("/azurespecials/apiVersion/method/string/none/query/local/null")
        Response getMethodLocalNull(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage) throws ServiceException;

        @GET("/azurespecials/apiVersion/method/string/none/query/local/null")
        void getMethodLocalNullAsync(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, ServiceResponseCallback cb);

        @GET("/azurespecials/apiVersion/path/string/none/query/local/2.0")
        Response getPathLocalValid(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage) throws ServiceException;

        @GET("/azurespecials/apiVersion/path/string/none/query/local/2.0")
        void getPathLocalValidAsync(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, ServiceResponseCallback cb);

        @GET("/azurespecials/apiVersion/swagger/string/none/query/local/2.0")
        Response getSwaggerLocalValid(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage) throws ServiceException;

        @GET("/azurespecials/apiVersion/swagger/string/none/query/local/2.0")
        void getSwaggerLocalValidAsync(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, ServiceResponseCallback cb);

    }
    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed
     *
     * @param apiVersion This should appear as a method parameter, use value '2.0'. Possible values for this parameter include: '2.0'
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void getMethodLocalValid(String apiVersion) throws ServiceException;

    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed
     *
     * @param apiVersion This should appear as a method parameter, use value '2.0'. Possible values for this parameter include: '2.0'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getMethodLocalValidAsync(String apiVersion, final ServiceCallback<Void> serviceCallback);

    /**
     * Get method with api-version modeled in the method.  pass in api-version = null to succeed
     *
     * @param apiVersion This should appear as a method parameter, use value null, this should result in no serialized parameter
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void getMethodLocalNull(String apiVersion) throws ServiceException;

    /**
     * Get method with api-version modeled in the method.  pass in api-version = null to succeed
     *
     * @param apiVersion This should appear as a method parameter, use value null, this should result in no serialized parameter
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getMethodLocalNullAsync(String apiVersion, final ServiceCallback<Void> serviceCallback);

    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed
     *
     * @param apiVersion This should appear as a method parameter, use value '2.0'. Possible values for this parameter include: '2.0'
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void getPathLocalValid(String apiVersion) throws ServiceException;

    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed
     *
     * @param apiVersion This should appear as a method parameter, use value '2.0'. Possible values for this parameter include: '2.0'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getPathLocalValidAsync(String apiVersion, final ServiceCallback<Void> serviceCallback);

    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed
     *
     * @param apiVersion The api version, which appears in the query, the value is always '2.0'. Possible values for this parameter include: '2.0'
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void getSwaggerLocalValid(String apiVersion) throws ServiceException;

    /**
     * Get method with api-version modeled in the method.  pass in api-version = '2.0' to succeed
     *
     * @param apiVersion The api version, which appears in the query, the value is always '2.0'. Possible values for this parameter include: '2.0'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getSwaggerLocalValidAsync(String apiVersion, final ServiceCallback<Void> serviceCallback);

}