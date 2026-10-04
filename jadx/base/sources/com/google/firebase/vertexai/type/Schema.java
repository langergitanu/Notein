package com.google.firebase.vertexai.type;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.network.embedded.C18437z2;
import com.microsoft.identity.common.internal.fido.FidoChallenge;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0000Ooo.C24242OooOOo;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO00.C33938OooO0o0;
import oO0oO00.C33940OooO0oo;
import oO0oO00.C33977OoooOOo;
import oO0oO00.o000000O;
import oO0oO00.o00000OO;
import oO0oO000.OooO0O0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34449Oooo0oo;
import oOo000Oo.OooOo;
import oOo000Oo.Oooo0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000  2\u00020\u0001:\u0002 !B{\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0000¢\u0006\u0002\u0010\u000eJ\r\u0010\u001d\u001a\u00020\u001eH\u0000¢\u0006\u0002\b\u001fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0010¨\u0006\""}, m80612d2 = {"Lcom/google/firebase/vertexai/type/Schema;", "", C18437z2.f56754h, "", "description", "format", "nullable", "", "enum", "", "properties", "", FidoChallenge.DEFAULT_USER_VERIFICATION_POLICY, FirebaseAnalytics.Param.ITEMS, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Lcom/google/firebase/vertexai/type/Schema;)V", "getDescription", "()Ljava/lang/String;", "getEnum", "()Ljava/util/List;", "getFormat", "getItems", "()Lcom/google/firebase/vertexai/type/Schema;", "getNullable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getProperties", "()Ljava/util/Map;", "getRequired", "getType", "toInternal", "Lcom/google/firebase/vertexai/type/Schema$Internal;", "toInternal$com_google_firebase_firebase_vertexai", "Companion", "Internal", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class Schema {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String description;
    private final List<String> enum;
    private final String format;
    private final Schema items;
    private final Boolean nullable;
    private final Map<String, Schema> properties;
    private final List<String> required;
    private final String type;

    @Metadata(m80611d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007J\u001e\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007J#\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\fJ,\u0010\r\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007J#\u0010\u0010\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\u0011J#\u0010\u0012\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\u0013J#\u0010\u0014\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\u0015JB\u0010\u0016\u001a\u00020\u00042\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00182\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007J/\u0010\u001a\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0002\b\u001d¨\u0006\u001e"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/Schema$Companion;", "", "()V", "array", "Lcom/google/firebase/vertexai/type/Schema;", FirebaseAnalytics.Param.ITEMS, "description", "", "nullable", "", "boolean", "double", "numDouble", "enumeration", C18437z2.f56756j, "", "float", "numFloat", "integer", "numInt", "long", "numLong", "obj", "properties", "", "optionalProperties", "string", "format", "Lcom/google/firebase/vertexai/type/StringFormat;", "str", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public static /* synthetic */ Schema array$default(Companion companion, Schema schema, String str, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                z = false;
            }
            return companion.array(schema, str, z);
        }

        public static /* synthetic */ Schema boolean$default(Companion companion, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.m80708boolean(str, z);
        }

        public static /* synthetic */ Schema enumeration$default(Companion companion, List list, String str, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                z = false;
            }
            return companion.enumeration(list, str, z);
        }

        public static /* synthetic */ Schema numDouble$default(Companion companion, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.numDouble(str, z);
        }

        public static /* synthetic */ Schema numFloat$default(Companion companion, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.numFloat(str, z);
        }

        public static /* synthetic */ Schema numInt$default(Companion companion, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.numInt(str, z);
        }

        public static /* synthetic */ Schema numLong$default(Companion companion, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.numLong(str, z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Schema obj$default(Companion companion, Map map, List list, String str, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                list = C34434OooOoO.f123453OooOo0o;
            }
            if ((i & 4) != 0) {
                str = null;
            }
            if ((i & 8) != 0) {
                z = false;
            }
            return companion.obj(map, list, str, z);
        }

        public static /* synthetic */ Schema str$default(Companion companion, String str, boolean z, StringFormat stringFormat, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                stringFormat = null;
            }
            return companion.str(str, z, stringFormat);
        }

        public final Schema array(Schema items) {
            OooOOO0.OooO0oO(items, "items");
            return array$default(this, items, null, false, 6, null);
        }

        /* JADX INFO: renamed from: boolean, reason: not valid java name */
        public final Schema m80706boolean() {
            return boolean$default(this, null, false, 3, null);
        }

        public final Schema enumeration(List<String> values) {
            OooOOO0.OooO0oO(values, "values");
            return enumeration$default(this, values, null, false, 6, null);
        }

        public final Schema numDouble() {
            return numDouble$default(this, null, false, 3, null);
        }

        public final Schema numFloat() {
            return numFloat$default(this, null, false, 3, null);
        }

        public final Schema numInt() {
            return numInt$default(this, null, false, 3, null);
        }

        public final Schema numLong() {
            return numLong$default(this, null, false, 3, null);
        }

        public final Schema obj(Map<String, Schema> properties) {
            OooOOO0.OooO0oO(properties, "properties");
            return obj$default(this, properties, null, null, false, 14, null);
        }

        public final Schema str() {
            return str$default(this, null, false, null, 7, null);
        }

        private Companion() {
        }

        public final Schema array(Schema items, String str) {
            OooOOO0.OooO0oO(items, "items");
            return array$default(this, items, str, false, 4, null);
        }

        /* JADX INFO: renamed from: boolean, reason: not valid java name */
        public final Schema m80707boolean(String str) {
            return boolean$default(this, str, false, 2, null);
        }

        public final Schema enumeration(List<String> values, String str) {
            OooOOO0.OooO0oO(values, "values");
            return enumeration$default(this, values, str, false, 4, null);
        }

        public final Schema numDouble(String str) {
            return numDouble$default(this, str, false, 2, null);
        }

        public final Schema numFloat(String str) {
            return numFloat$default(this, str, false, 2, null);
        }

        public final Schema numInt(String str) {
            return numInt$default(this, str, false, 2, null);
        }

        public final Schema numLong(String str) {
            return numLong$default(this, str, false, 2, null);
        }

        public final Schema obj(Map<String, Schema> properties, List<String> optionalProperties) {
            OooOOO0.OooO0oO(properties, "properties");
            OooOOO0.OooO0oO(optionalProperties, "optionalProperties");
            return obj$default(this, properties, optionalProperties, null, false, 12, null);
        }

        public final Schema str(String str) {
            return str$default(this, str, false, null, 6, null);
        }

        public final Schema array(Schema items, String description, boolean nullable) {
            OooOOO0.OooO0oO(items, "items");
            return new Schema("ARRAY", description, null, Boolean.valueOf(nullable), null, null, null, items, 116, null);
        }

        /* JADX INFO: renamed from: boolean, reason: not valid java name */
        public final Schema m80708boolean(String description, boolean nullable) {
            return new Schema("BOOLEAN", description, null, Boolean.valueOf(nullable), null, null, null, null, 244, null);
        }

        public final Schema enumeration(List<String> values, String description, boolean nullable) {
            OooOOO0.OooO0oO(values, "values");
            return new Schema("STRING", description, "enum", Boolean.valueOf(nullable), values, null, null, null, 224, null);
        }

        public final Schema numDouble(String description, boolean nullable) {
            return new Schema("NUMBER", description, null, Boolean.valueOf(nullable), null, null, null, null, 244, null);
        }

        public final Schema numFloat(String description, boolean nullable) {
            return new Schema("NUMBER", description, "float", Boolean.valueOf(nullable), null, null, null, null, 240, null);
        }

        public final Schema numInt(String description, boolean nullable) {
            return new Schema("INTEGER", description, "int32", Boolean.valueOf(nullable), null, null, null, null, 240, null);
        }

        public final Schema numLong(String description, boolean nullable) {
            return new Schema("INTEGER", description, null, Boolean.valueOf(nullable), null, null, null, null, 244, null);
        }

        public final Schema obj(Map<String, Schema> properties, List<String> optionalProperties, String str) {
            OooOOO0.OooO0oO(properties, "properties");
            OooOOO0.OooO0oO(optionalProperties, "optionalProperties");
            return obj$default(this, properties, optionalProperties, str, false, 8, null);
        }

        public final Schema str(String str, boolean z) {
            return str$default(this, str, z, null, 4, null);
        }

        public final Schema obj(Map<String, Schema> properties, List<String> optionalProperties, String description, boolean nullable) {
            OooOOO0.OooO0oO(properties, "properties");
            OooOOO0.OooO0oO(optionalProperties, "optionalProperties");
            if (properties.keySet().containsAll(optionalProperties)) {
                return new Schema("OBJECT", description, null, Boolean.valueOf(nullable), null, properties, OooOo.o0ooOO0(C34449Oooo0oo.OooO0oO(properties.keySet(), OooOo.o0OO00O(optionalProperties))), null, 148, null);
            }
            throw new IllegalArgumentException("All optional properties must be present in properties. Missing: " + OooOo.Ooooo00(optionalProperties, properties.keySet()));
        }

        public final Schema str(String description, boolean nullable, StringFormat format) {
            return new Schema("STRING", description, format != null ? format.getValue() : null, Boolean.valueOf(nullable), null, null, null, null, 240, null);
        }
    }

    public Schema(String type, String str, String str2, Boolean bool, List<String> list, Map<String, Schema> map, List<String> list2, Schema schema) {
        OooOOO0.OooO0oO(type, "type");
        this.type = type;
        this.description = str;
        this.format = str2;
        this.nullable = bool;
        this.enum = list;
        this.properties = map;
        this.required = list2;
        this.items = schema;
    }

    public static final Schema array(Schema schema) {
        return INSTANCE.array(schema);
    }

    /* JADX INFO: renamed from: boolean, reason: not valid java name */
    public static final Schema m80703boolean() {
        return INSTANCE.m80706boolean();
    }

    public static final Schema enumeration(List<String> list) {
        return INSTANCE.enumeration(list);
    }

    public static final Schema numDouble() {
        return INSTANCE.numDouble();
    }

    public static final Schema numFloat() {
        return INSTANCE.numFloat();
    }

    public static final Schema numInt() {
        return INSTANCE.numInt();
    }

    public static final Schema numLong() {
        return INSTANCE.numLong();
    }

    public static final Schema obj(Map<String, Schema> map) {
        return INSTANCE.obj(map);
    }

    public static final Schema str() {
        return INSTANCE.str();
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<String> getEnum() {
        return this.enum;
    }

    public final String getFormat() {
        return this.format;
    }

    public final Schema getItems() {
        return this.items;
    }

    public final Boolean getNullable() {
        return this.nullable;
    }

    public final Map<String, Schema> getProperties() {
        return this.properties;
    }

    public final List<String> getRequired() {
        return this.required;
    }

    public final String getType() {
        return this.type;
    }

    public final Internal toInternal$com_google_firebase_firebase_vertexai() {
        LinkedHashMap linkedHashMap;
        String str = this.type;
        String str2 = this.description;
        String str3 = this.format;
        Boolean bool = this.nullable;
        List<String> list = this.enum;
        Map<String, Schema> map = this.properties;
        if (map != null) {
            linkedHashMap = new LinkedHashMap(Oooo0.OooO0Oo(map.size()));
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), ((Schema) entry.getValue()).toInternal$com_google_firebase_firebase_vertexai());
            }
        } else {
            linkedHashMap = null;
        }
        List<String> list2 = this.required;
        Schema schema = this.items;
        return new Internal(str, str2, str3, bool, list, linkedHashMap, list2, schema != null ? schema.toInternal$com_google_firebase_firebase_vertexai() : null);
    }

    public static final Schema array(Schema schema, String str) {
        return INSTANCE.array(schema, str);
    }

    /* JADX INFO: renamed from: boolean, reason: not valid java name */
    public static final Schema m80704boolean(String str) {
        return INSTANCE.m80707boolean(str);
    }

    public static final Schema enumeration(List<String> list, String str) {
        return INSTANCE.enumeration(list, str);
    }

    public static final Schema numDouble(String str) {
        return INSTANCE.numDouble(str);
    }

    public static final Schema numFloat(String str) {
        return INSTANCE.numFloat(str);
    }

    public static final Schema numInt(String str) {
        return INSTANCE.numInt(str);
    }

    public static final Schema numLong(String str) {
        return INSTANCE.numLong(str);
    }

    public static final Schema obj(Map<String, Schema> map, List<String> list) {
        return INSTANCE.obj(map, list);
    }

    public static final Schema str(String str) {
        return INSTANCE.str(str);
    }

    @InterfaceC33908OooO
    @Metadata(m80611d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\b\u0081\b\u0018\u0000 ?2\u00020\u0001:\u0002@?B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0000\u0018\u00010\n\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u000e\u0010\u000fB\u0083\u0001\b\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0000\u0018\u00010\n\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J(\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018HÇ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u001e\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0000\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b'\u0010$J\u0012\u0010(\u001a\u0004\u0018\u00010\u0000HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0086\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0000\u0018\u00010\n2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0000HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001eJ\u0010\u0010-\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00100\u001a\u00020\u00062\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b4\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b5\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u0010\"R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b9\u0010$R%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0000\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\b;\u0010&R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\b<\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00008\u0006¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\b>\u0010)¨\u0006A"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/Schema$Internal;", "", "", C18437z2.f56754h, "description", "format", "", "nullable", "", "enum", "", "properties", FidoChallenge.DEFAULT_USER_VERIFICATION_POLICY, FirebaseAnalytics.Param.ITEMS, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Lcom/google/firebase/vertexai/type/Schema$Internal;)V", "", "seen1", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Lcom/google/firebase/vertexai/type/Schema$Internal;LoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self", "(Lcom/google/firebase/vertexai/type/Schema$Internal;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/lang/Boolean;", "component5", "()Ljava/util/List;", "component6", "()Ljava/util/Map;", "component7", "component8", "()Lcom/google/firebase/vertexai/type/Schema$Internal;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Lcom/google/firebase/vertexai/type/Schema$Internal;)Lcom/google/firebase/vertexai/type/Schema$Internal;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "getDescription", "getFormat", "Ljava/lang/Boolean;", "getNullable", "Ljava/util/List;", "getEnum", "Ljava/util/Map;", "getProperties", "getRequired", "Lcom/google/firebase/vertexai/type/Schema$Internal;", "getItems", "Companion", "$serializer", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final /* data */ class Internal {
        private static final InterfaceC33911OooO0OO<Object>[] $childSerializers;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String description;
        private final List<String> enum;
        private final String format;
        private final Internal items;
        private final Boolean nullable;
        private final Map<String, Internal> properties;
        private final List<String> required;
        private final String type;

        @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/Schema$Internal$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/google/firebase/vertexai/type/Schema$Internal;", "serializer", "()LoO0o0ooO/OooO0OO;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
                this();
            }

            public final InterfaceC33911OooO0OO<Internal> serializer() {
                return Schema$Internal$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        static {
            o00000OO o00000oo2 = o00000OO.f122230OooO00o;
            $childSerializers = new InterfaceC33911OooO0OO[]{null, null, null, null, new C33938OooO0o0(o00000oo2), new C33977OoooOOo(o00000oo2, Schema$Internal$$serializer.INSTANCE), new C33938OooO0o0(o00000oo2), null};
        }

        public /* synthetic */ Internal(int i, String str, String str2, String str3, Boolean bool, List list, Map map, List list2, Internal internal, o000000O o000000o2) {
            if (1 != (i & 1)) {
                C24242OooOOo.OooO0O0(i, 1, Schema$Internal$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.type = str;
            if ((i & 2) == 0) {
                this.description = null;
            } else {
                this.description = str2;
            }
            if ((i & 4) == 0) {
                this.format = null;
            } else {
                this.format = str3;
            }
            if ((i & 8) == 0) {
                this.nullable = Boolean.FALSE;
            } else {
                this.nullable = bool;
            }
            if ((i & 16) == 0) {
                this.enum = null;
            } else {
                this.enum = list;
            }
            if ((i & 32) == 0) {
                this.properties = null;
            } else {
                this.properties = map;
            }
            if ((i & 64) == 0) {
                this.required = null;
            } else {
                this.required = list2;
            }
            if ((i & 128) == 0) {
                this.items = null;
            } else {
                this.items = internal;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Internal copy$default(Internal internal, String str, String str2, String str3, Boolean bool, List list, Map map, List list2, Internal internal2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = internal.type;
            }
            if ((i & 2) != 0) {
                str2 = internal.description;
            }
            if ((i & 4) != 0) {
                str3 = internal.format;
            }
            if ((i & 8) != 0) {
                bool = internal.nullable;
            }
            if ((i & 16) != 0) {
                list = internal.enum;
            }
            if ((i & 32) != 0) {
                map = internal.properties;
            }
            if ((i & 64) != 0) {
                list2 = internal.required;
            }
            if ((i & 128) != 0) {
                internal2 = internal.items;
            }
            List list3 = list2;
            Internal internal3 = internal2;
            List list4 = list;
            Map map2 = map;
            return internal.copy(str, str2, str3, bool, list4, map2, list3, internal3);
        }

        public static final /* synthetic */ void write$Self(Internal self, OooO0O0 output, InterfaceC33531OooO0o0 serialDesc) {
            InterfaceC33911OooO0OO<Object>[] interfaceC33911OooO0OOArr = $childSerializers;
            output.OooOO0o(serialDesc, 0, self.type);
            if (output.OooOoO0(serialDesc) || self.description != null) {
                output.OooOo(serialDesc, 1, o00000OO.f122230OooO00o, self.description);
            }
            if (output.OooOoO0(serialDesc) || self.format != null) {
                output.OooOo(serialDesc, 2, o00000OO.f122230OooO00o, self.format);
            }
            if (output.OooOoO0(serialDesc) || !OooOOO0.OooO0O0(self.nullable, Boolean.FALSE)) {
                output.OooOo(serialDesc, 3, C33940OooO0oo.f122144OooO00o, self.nullable);
            }
            if (output.OooOoO0(serialDesc) || self.enum != null) {
                output.OooOo(serialDesc, 4, interfaceC33911OooO0OOArr[4], self.enum);
            }
            if (output.OooOoO0(serialDesc) || self.properties != null) {
                output.OooOo(serialDesc, 5, interfaceC33911OooO0OOArr[5], self.properties);
            }
            if (output.OooOoO0(serialDesc) || self.required != null) {
                output.OooOo(serialDesc, 6, interfaceC33911OooO0OOArr[6], self.required);
            }
            if (!output.OooOoO0(serialDesc) && self.items == null) {
                return;
            }
            output.OooOo(serialDesc, 7, Schema$Internal$$serializer.INSTANCE, self.items);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getFormat() {
            return this.format;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Boolean getNullable() {
            return this.nullable;
        }

        public final List<String> component5() {
            return this.enum;
        }

        public final Map<String, Internal> component6() {
            return this.properties;
        }

        public final List<String> component7() {
            return this.required;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final Internal getItems() {
            return this.items;
        }

        public final Internal copy(String type, String description, String format, Boolean nullable, List<String> list, Map<String, Internal> properties, List<String> required, Internal items) {
            OooOOO0.OooO0oO(type, "type");
            return new Internal(type, description, format, nullable, list, properties, required, items);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Internal)) {
                return false;
            }
            Internal internal = (Internal) other;
            return OooOOO0.OooO0O0(this.type, internal.type) && OooOOO0.OooO0O0(this.description, internal.description) && OooOOO0.OooO0O0(this.format, internal.format) && OooOOO0.OooO0O0(this.nullable, internal.nullable) && OooOOO0.OooO0O0(this.enum, internal.enum) && OooOOO0.OooO0O0(this.properties, internal.properties) && OooOOO0.OooO0O0(this.required, internal.required) && OooOOO0.OooO0O0(this.items, internal.items);
        }

        public final String getDescription() {
            return this.description;
        }

        public final List<String> getEnum() {
            return this.enum;
        }

        public final String getFormat() {
            return this.format;
        }

        public final Internal getItems() {
            return this.items;
        }

        public final Boolean getNullable() {
            return this.nullable;
        }

        public final Map<String, Internal> getProperties() {
            return this.properties;
        }

        public final List<String> getRequired() {
            return this.required;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            int iHashCode = this.type.hashCode() * 31;
            String str = this.description;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.format;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.nullable;
            int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            List<String> list = this.enum;
            int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
            Map<String, Internal> map = this.properties;
            int iHashCode6 = (iHashCode5 + (map == null ? 0 : map.hashCode())) * 31;
            List<String> list2 = this.required;
            int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
            Internal internal = this.items;
            return iHashCode7 + (internal != null ? internal.hashCode() : 0);
        }

        public String toString() {
            return "Internal(type=" + this.type + ", description=" + this.description + ", format=" + this.format + ", nullable=" + this.nullable + ", enum=" + this.enum + ", properties=" + this.properties + ", required=" + this.required + ", items=" + this.items + ')';
        }

        public Internal(String type, String str, String str2, Boolean bool, List<String> list, Map<String, Internal> map, List<String> list2, Internal internal) {
            OooOOO0.OooO0oO(type, "type");
            this.type = type;
            this.description = str;
            this.format = str2;
            this.nullable = bool;
            this.enum = list;
            this.properties = map;
            this.required = list2;
            this.items = internal;
        }

        public /* synthetic */ Internal(String str, String str2, String str3, Boolean bool, List list, Map map, List list2, Internal internal, int i, C24018OooO0oo c24018OooO0oo) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? Boolean.FALSE : bool, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : map, (i & 64) != 0 ? null : list2, (i & 128) != 0 ? null : internal);
        }
    }

    public static final Schema array(Schema schema, String str, boolean z) {
        return INSTANCE.array(schema, str, z);
    }

    /* JADX INFO: renamed from: boolean, reason: not valid java name */
    public static final Schema m80705boolean(String str, boolean z) {
        return INSTANCE.m80708boolean(str, z);
    }

    public static final Schema enumeration(List<String> list, String str, boolean z) {
        return INSTANCE.enumeration(list, str, z);
    }

    public static final Schema numDouble(String str, boolean z) {
        return INSTANCE.numDouble(str, z);
    }

    public static final Schema numFloat(String str, boolean z) {
        return INSTANCE.numFloat(str, z);
    }

    public static final Schema numInt(String str, boolean z) {
        return INSTANCE.numInt(str, z);
    }

    public static final Schema numLong(String str, boolean z) {
        return INSTANCE.numLong(str, z);
    }

    public static final Schema obj(Map<String, Schema> map, List<String> list, String str) {
        return INSTANCE.obj(map, list, str);
    }

    public static final Schema str(String str, boolean z) {
        return INSTANCE.str(str, z);
    }

    public static final Schema obj(Map<String, Schema> map, List<String> list, String str, boolean z) {
        return INSTANCE.obj(map, list, str, z);
    }

    public static final Schema str(String str, boolean z, StringFormat stringFormat) {
        return INSTANCE.str(str, z, stringFormat);
    }

    public /* synthetic */ Schema(String str, String str2, String str3, Boolean bool, List list, Map map, List list2, Schema schema, int i, C24018OooO0oo c24018OooO0oo) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : map, (i & 64) != 0 ? null : list2, (i & 128) != 0 ? null : schema);
    }
}
