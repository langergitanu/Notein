package androidx.work;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import o00O0O0o.OooOO0O;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final String f66684OooO0O0 = OooOO0O.OooO0o0("Data");

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO0O0 f66685OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f66686OooO00o;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final HashMap f66687OooO00o = new HashMap();

        public final void OooO00o(HashMap map) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                HashMap map2 = this.f66687OooO00o;
                if (value == null) {
                    map2.put(str, null);
                } else {
                    Class<?> cls = value.getClass();
                    if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                        map2.put(str, value);
                    } else {
                        int i = 0;
                        if (cls == boolean[].class) {
                            boolean[] zArr = (boolean[]) value;
                            String str2 = OooO0O0.f66684OooO0O0;
                            Boolean[] boolArr = new Boolean[zArr.length];
                            while (i < zArr.length) {
                                boolArr[i] = Boolean.valueOf(zArr[i]);
                                i++;
                            }
                            map2.put(str, boolArr);
                        } else if (cls == byte[].class) {
                            byte[] bArr = (byte[]) value;
                            String str3 = OooO0O0.f66684OooO0O0;
                            Byte[] bArr2 = new Byte[bArr.length];
                            while (i < bArr.length) {
                                bArr2[i] = Byte.valueOf(bArr[i]);
                                i++;
                            }
                            map2.put(str, bArr2);
                        } else if (cls == int[].class) {
                            int[] iArr = (int[]) value;
                            String str4 = OooO0O0.f66684OooO0O0;
                            Integer[] numArr = new Integer[iArr.length];
                            while (i < iArr.length) {
                                numArr[i] = Integer.valueOf(iArr[i]);
                                i++;
                            }
                            map2.put(str, numArr);
                        } else if (cls == long[].class) {
                            long[] jArr = (long[]) value;
                            String str5 = OooO0O0.f66684OooO0O0;
                            Long[] lArr = new Long[jArr.length];
                            while (i < jArr.length) {
                                lArr[i] = Long.valueOf(jArr[i]);
                                i++;
                            }
                            map2.put(str, lArr);
                        } else if (cls == float[].class) {
                            float[] fArr = (float[]) value;
                            String str6 = OooO0O0.f66684OooO0O0;
                            Float[] fArr2 = new Float[fArr.length];
                            while (i < fArr.length) {
                                fArr2[i] = Float.valueOf(fArr[i]);
                                i++;
                            }
                            map2.put(str, fArr2);
                        } else {
                            if (cls != double[].class) {
                                throw new IllegalArgumentException("Key " + str + " has invalid type " + cls);
                            }
                            double[] dArr = (double[]) value;
                            String str7 = OooO0O0.f66684OooO0O0;
                            Double[] dArr2 = new Double[dArr.length];
                            while (i < dArr.length) {
                                dArr2[i] = Double.valueOf(dArr[i]);
                                i++;
                            }
                            map2.put(str, dArr2);
                        }
                    }
                }
            }
        }
    }

    static {
        OooO0O0 oooO0O0 = new OooO0O0(new HashMap());
        OooO0OO(oooO0O0);
        f66685OooO0OO = oooO0O0;
    }

    public OooO0O0() {
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0040 -> B:37:0x005f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static OooO0O0 OooO00o(byte[] bArr) throws Throwable {
        ObjectInputStream objectInputStream;
        Throwable e;
        String str = f66684OooO0O0;
        if (bArr.length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        HashMap map = new HashMap();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ObjectInputStream objectInputStream2 = null;
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    for (int i = objectInputStream.readInt(); i > 0; i--) {
                        map.put(objectInputStream.readUTF(), objectInputStream.readObject());
                    }
                    try {
                        objectInputStream.close();
                    } catch (IOException e2) {
                        Log.e(str, "Error in Data#fromByteArray: ", e2);
                    }
                    byteArrayInputStream.close();
                } catch (IOException e3) {
                    e = e3;
                    Log.e(str, "Error in Data#fromByteArray: ", e);
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                        } catch (IOException e4) {
                            Log.e(str, "Error in Data#fromByteArray: ", e4);
                        }
                    }
                    byteArrayInputStream.close();
                } catch (ClassNotFoundException e5) {
                    e = e5;
                    Log.e(str, "Error in Data#fromByteArray: ", e);
                    if (objectInputStream != null) {
                    }
                    byteArrayInputStream.close();
                }
            } catch (IOException e6) {
                Log.e(str, "Error in Data#fromByteArray: ", e6);
            }
        } catch (IOException e7) {
            e = e7;
            Throwable th2 = e;
            objectInputStream = null;
            e = th2;
            Log.e(str, "Error in Data#fromByteArray: ", e);
            if (objectInputStream != null) {
            }
            byteArrayInputStream.close();
            return new OooO0O0(map);
        } catch (ClassNotFoundException e8) {
            e = e8;
            Throwable th22 = e;
            objectInputStream = null;
            e = th22;
            Log.e(str, "Error in Data#fromByteArray: ", e);
            if (objectInputStream != null) {
            }
            byteArrayInputStream.close();
            return new OooO0O0(map);
        } catch (Throwable th3) {
            th = th3;
            if (0 != 0) {
                try {
                    objectInputStream2.close();
                } catch (IOException e9) {
                    Log.e(str, "Error in Data#fromByteArray: ", e9);
                }
            }
            try {
                byteArrayInputStream.close();
                throw th;
            } catch (IOException e10) {
                Log.e(str, "Error in Data#fromByteArray: ", e10);
                throw th;
            }
        }
        return new OooO0O0(map);
    }

    public static byte[] OooO0OO(OooO0O0 oooO0O0) throws Throwable {
        ObjectOutputStream objectOutputStream;
        String str = f66684OooO0O0;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
        }
        try {
            objectOutputStream.writeInt(oooO0O0.f66686OooO00o.size());
            for (Map.Entry entry : oooO0O0.f66686OooO00o.entrySet()) {
                objectOutputStream.writeUTF((String) entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            try {
                objectOutputStream.close();
            } catch (IOException e2) {
                Log.e(str, "Error in Data#toByteArray: ", e2);
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e3) {
                Log.e(str, "Error in Data#toByteArray: ", e3);
            }
            if (byteArrayOutputStream.size() <= 10240) {
                return byteArrayOutputStream.toByteArray();
            }
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        } catch (IOException e4) {
            e = e4;
            objectOutputStream2 = objectOutputStream;
            Log.e(str, "Error in Data#toByteArray: ", e);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e5) {
                    Log.e(str, "Error in Data#toByteArray: ", e5);
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e6) {
                Log.e(str, "Error in Data#toByteArray: ", e6);
            }
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e7) {
                    Log.e(str, "Error in Data#toByteArray: ", e7);
                }
            }
            try {
                byteArrayOutputStream.close();
                throw th;
            } catch (IOException e8) {
                Log.e(str, "Error in Data#toByteArray: ", e8);
                throw th;
            }
        }
    }

    public final String OooO0O0(String str) {
        Object obj = this.f66686OooO00o.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && OooO0O0.class == obj.getClass()) {
                HashMap map = this.f66686OooO00o;
                Set<String> setKeySet = map.keySet();
                HashMap map2 = ((OooO0O0) obj).f66686OooO00o;
                if (setKeySet.equals(map2.keySet())) {
                    for (String str : setKeySet) {
                        Object obj2 = map.get(str);
                        Object obj3 = map2.get(str);
                        if (!((obj2 == null || obj3 == null) ? obj2 == obj3 : ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj2, (Object[]) obj3) : obj2.equals(obj3))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f66686OooO00o.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        HashMap map = this.f66686OooO00o;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = map.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public OooO0O0(OooO0O0 oooO0O0) {
        this.f66686OooO00o = new HashMap(oooO0O0.f66686OooO00o);
    }

    public OooO0O0(HashMap map) {
        this.f66686OooO00o = new HashMap(map);
    }
}
