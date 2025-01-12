/*
 * Bob API
 * Access your employees data with the Bob API
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonElement;
import io.gsonfire.GsonFireBuilder;
import io.gsonfire.TypeSelector;

import okio.ByteString;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;

/*
 * A JSON utility class
 *
 * NOTE: in the future, this class may be converted to static, which may break
 *       backward-compatibility
 */
public class JSON {
    private static Gson gson;
    private static boolean isLenientOnJson = false;
    private static DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private static SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private static OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter();
    private static LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();
    private static ByteArrayAdapter byteArrayAdapter = new ByteArrayAdapter();

    @SuppressWarnings("unchecked")
    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder()
        ;
        GsonBuilder builder = fireBuilder.createGsonBuilder();
        return builder;
    }

    private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
        JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
        if (null == element) {
            throw new IllegalArgumentException("missing discriminator field: <" + discriminatorField + ">");
        }
        return element.getAsString();
    }

    /**
     * Returns the Java class that implements the OpenAPI schema for the specified discriminator value.
     *
     * @param classByDiscriminatorValue The map of discriminator values to Java classes.
     * @param discriminatorValue The value of the OpenAPI discriminator in the input data.
     * @return The Java class that implements the OpenAPI schema
     */
    private static Class getClassByDiscriminator(Map classByDiscriminatorValue, String discriminatorValue) {
        Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue);
        if (null == clazz) {
            throw new IllegalArgumentException("cannot determine model class of name: <" + discriminatorValue + ">");
        }
        return clazz;
    }

    {
        GsonBuilder gsonBuilder = createGson();
        gsonBuilder.registerTypeAdapter(Date.class, dateTypeAdapter);
        gsonBuilder.registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter);
        gsonBuilder.registerTypeAdapter(LocalDate.class, localDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(byte[].class, byteArrayAdapter);

        /**
         * For the "type: number" schema we accept both Double and Integer
         * In the case that we pass "1.0" or "1" we serialize the JsonPrimitive
         * as the "1" literal. This is useful when the server expects an integer.
         */
        gsonBuilder.registerTypeAdapter(Double.class, new JsonSerializer<Double>() {

            @Override
            public JsonElement serialize(Double src, Type typeOfSrc, JsonSerializationContext context) {
                if (src == src.longValue())
                    return new JsonPrimitive(src.longValue());
                return new JsonPrimitive(src);
            }
        });
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.AboutPart.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.AddDocument.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.AdjustmentRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.BalanceResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.ChangeEmail.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.CreateEmployeeRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.CreateEmployeeRequestWork.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.CreateFieldRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.CurrencyValue.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.CustomTableColumn.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.CustomTableEntriesList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.CustomTableEntry.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.CustomTableMetadata.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.CustomTableMetadataList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.CustomTablesCreateNewEntryRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.CustomTablesUpdateEntryRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.DocumentsUploadConfidentialFileRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.DocumentsUploadToSharedFolderRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.Employee.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeeDocumentResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeeDocumentWithDownloadLink.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeeFilter.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeeProfile.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeeReference.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeeTermination.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeeTerminationNoticePeriod.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.Employees.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmployeesProfiles.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmploymentEntries.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmploymentEntry.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EmploymentEntryAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EquityEntries.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EquityEntry.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.EquityEntryAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.Error.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.Field.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.FieldId.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.FieldTypeData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.FilterInstruction.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.FlatListItemId.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.GetPositionsRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.ImportAttendanceData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.ImportAttendanceEvent.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.ImportAttendanceResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.InvitationByWizard.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.LifeCycleEntries.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.LifeCycleEntry.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.LifeCycleEntryAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.List.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.ListItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.NewListItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.ObjectsMetadata.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.ObjectsMetadataFieldType.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.ObjectsMetadataJsonPath.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.OnboardingWizard.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.OnboardingWizards.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.OutToday.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.OutTodays.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.PeopleUpdateEmployeeRecordRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.PeopleUpdateEmployeeRecordRequestAbout.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.PeopleUpdateEmployeeRecordRequestPersonal.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.PersonalPart.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.Policy.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.PolicyNames.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.PolicyType.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.PolicyTypes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.PositionEntriesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.ReadEmployeesRequestReference.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.ReadSingleEmployeeRequestReference.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.ReasonCode.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.ReasonCodes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.ReasonCodesNames.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.Report.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.Reports.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.Request.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.Requests.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.SalaryEntries.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.SalaryEntry.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.SalaryEntryAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.StartDateUpdate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.SubmitTimeoffRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.SubmitTimeoffRequestDiffHours.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.SubmitTimeoffRequestDiffHoursDurationsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.TableEntry.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.Task.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.Tasks.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.TimeoffChange.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.TimeoffChanges.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.TimeoffRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.TimeoffRequestAttachmentLinksInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.TrainingEntries.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.TrainingEntry.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.TrainingEntryAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.UpdateFieldRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.UpdateListItemRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.UploadAvatar.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.VariableEntries.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.VariableEntry.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.VariableEntryAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.WorkEntries.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.WorkEntry.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.WorkEntryAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.WorkEntryAllOfReportsTo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.WorkPart.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.konfigthis.client.model.YearsOfServiceIncrements.CustomTypeAdapterFactory());
        gsonBuilder.disableHtmlEscaping();
        gson = gsonBuilder.create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public static Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     */
    public static void setGson(Gson gson) {
        JSON.gson = gson;
    }

    public static void setLenientOnJson(boolean lenientOnJson) {
        isLenientOnJson = lenientOnJson;
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public static String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T>        Type
     * @param body       The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public static <T> T deserialize(String body, Type returnType) {
        try {
            if (isLenientOnJson) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, returnType);
            } else {
                return gson.fromJson(body, returnType);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class)) {
                return (T) body;
            } else {
                throw (e);
            }
        }
    }

    /**
     * Gson TypeAdapter for Byte Array type
     */
    public static class ByteArrayAdapter extends TypeAdapter<byte[]> {

        @Override
        public void write(JsonWriter out, byte[] value) throws IOException {
            if (value == null) {
                out.nullValue();
            } else {
                out.value(ByteString.of(value).base64());
            }
        }

        @Override
        public byte[] read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String bytesAsBase64 = in.nextString();
                    ByteString byteString = ByteString.decodeBase64(bytesAsBase64);
                    return byteString.toByteArray();
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 OffsetDateTime type
     */
    public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

        private DateTimeFormatter formatter;

        public OffsetDateTimeTypeAdapter() {
            this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith("+0000")) {
                        date = date.substring(0, date.length()-5) + "Z";
                    }
                    return OffsetDateTime.parse(date, formatter);
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 LocalDate type
     */
    public static class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(DateTimeFormatter.ISO_LOCAL_DATE);
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return LocalDate.parse(date, formatter);
            }
        }
    }

    public static void setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        offsetDateTimeTypeAdapter.setFormat(dateFormat);
    }

    public static void setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {}

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, ISO8601Utils will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {}

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = ISO8601Utils.format(date, true);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return ISO8601Utils.parse(date, new ParsePosition(0));
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public static void setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
    }

    public static void setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
    }
}
