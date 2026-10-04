package com.orion.notein.data.p602db.entity;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Pair;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class BundleTypeAdapterFactory implements TypeAdapterFactory {

    /* JADX INFO: renamed from: com.orion.notein.data.db.entity.BundleTypeAdapterFactory$2 */
    public static /* synthetic */ class C188682 {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken;

        static {
            int[] iArr = new int[JsonToken.values().length];
            $SwitchMap$com$google$gson$stream$JsonToken = iArr;
            try {
                iArr[JsonToken.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BEGIN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BOOLEAN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NUMBER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.STRING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(final Gson gson, TypeToken<T> typeToken) {
        if (Bundle.class.isAssignableFrom(typeToken.getRawType())) {
            return (TypeAdapter<T>) new TypeAdapter<Bundle>() { // from class: com.orion.notein.data.db.entity.BundleTypeAdapterFactory.1
                private List readArray(JsonReader jsonReader) throws IOException {
                    ArrayList arrayList = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.peek() != JsonToken.END_ARRAY) {
                        arrayList.add(readValue(jsonReader));
                    }
                    jsonReader.endArray();
                    return arrayList;
                }

                private Object readNumber(JsonReader jsonReader) throws IOException {
                    return Double.valueOf(jsonReader.nextDouble());
                }

                private List<Pair<String, Object>> readObject(JsonReader jsonReader) throws IOException {
                    ArrayList arrayList = new ArrayList();
                    jsonReader.beginObject();
                    while (jsonReader.peek() != JsonToken.END_OBJECT) {
                        int i = C188682.$SwitchMap$com$google$gson$stream$JsonToken[jsonReader.peek().ordinal()];
                        if (i == 3) {
                            arrayList.add(new Pair(jsonReader.nextName(), readValue(jsonReader)));
                        } else if (i != 4) {
                            throw new IOException("expecting object: " + jsonReader.getPath());
                        }
                    }
                    jsonReader.endObject();
                    return arrayList;
                }

                private Object readValue(JsonReader jsonReader) throws IOException {
                    int i = C188682.$SwitchMap$com$google$gson$stream$JsonToken[jsonReader.peek().ordinal()];
                    if (i == 1) {
                        jsonReader.nextNull();
                        return null;
                    }
                    if (i == 2) {
                        return readObject(jsonReader);
                    }
                    if (i == 5) {
                        return readArray(jsonReader);
                    }
                    if (i == 6) {
                        return Boolean.valueOf(jsonReader.nextBoolean());
                    }
                    if (i == 7) {
                        return readNumber(jsonReader);
                    }
                    if (i == 8) {
                        return jsonReader.nextString();
                    }
                    throw new IOException("expecting value: " + jsonReader.getPath());
                }

                private Bundle toBundle(List<Pair<String, Object>> list) throws IOException {
                    Bundle bundle = new Bundle();
                    for (Pair<String, Object> pair : list) {
                        String str = (String) pair.first;
                        Object obj = pair.second;
                        if (obj instanceof String) {
                            bundle.putString(str, (String) obj);
                        } else if (obj instanceof Integer) {
                            bundle.putInt(str, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(str, ((Long) obj).longValue());
                        } else if (obj instanceof Double) {
                            bundle.putDouble(str, ((Double) obj).doubleValue());
                        } else if (obj instanceof Parcelable) {
                            bundle.putParcelable(str, (Parcelable) obj);
                        } else if (obj instanceof Boolean) {
                            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                        } else {
                            if (!(obj instanceof List)) {
                                throw new IOException("Unparcelable key, value: " + str + ", " + obj);
                            }
                            bundle.putParcelable(str, toBundle((List) obj));
                        }
                    }
                    return bundle;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.gson.TypeAdapter
                /* JADX INFO: renamed from: read */
                public Bundle read2(JsonReader jsonReader) throws IOException {
                    int i = C188682.$SwitchMap$com$google$gson$stream$JsonToken[jsonReader.peek().ordinal()];
                    if (i == 1) {
                        jsonReader.nextNull();
                        return null;
                    }
                    if (i == 2) {
                        return toBundle(readObject(jsonReader));
                    }
                    throw new IOException("expecting object: " + jsonReader.getPath());
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, Bundle bundle) throws IOException {
                    if (bundle == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    for (String str : bundle.keySet()) {
                        jsonWriter.name(str);
                        Object obj = bundle.get(str);
                        if (obj == null) {
                            jsonWriter.nullValue();
                        } else {
                            gson.toJson(obj, obj.getClass(), jsonWriter);
                        }
                    }
                    jsonWriter.endObject();
                }
            };
        }
        return null;
    }
}
