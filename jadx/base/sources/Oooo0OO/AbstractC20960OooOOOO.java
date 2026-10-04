package Oooo0OO;

import OooOoo0.oo000o;
import OooOooO.C20738OooOOOo;
import Oooo0oO.o00oO0O;
import OooooO0.C21293OooOO0;
import OooooOO.C21348Ooooo0o;
import Oooooo0.C21397OooO00o;
import Oooooo0.InterfaceC21400OooO0Oo;
import Oooooo0.InterfaceC21402OooO0o0;
import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import oO00ooO.C32460OooOooO;
import oO0o0OO.InterfaceC33636Oooo00o;
import oo000o.InterfaceC34635OooOOOO;

/* JADX INFO: renamed from: Oooo0OO.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC20960OooOOOO implements oo000o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f60501OooOo0o;

    public AbstractC20960OooOOOO(int i) {
        switch (i) {
            case 2:
                this.f60501OooOo0o = new Gson();
                break;
            case 3:
                this.f60501OooOo0o = Collections.newSetFromMap(new IdentityHashMap());
                break;
        }
    }

    public long OooO00o() {
        InterfaceC34635OooOOOO interfaceC34635OooOOOO = (InterfaceC34635OooOOOO) this.f60501OooOo0o;
        if (interfaceC34635OooOOOO != null) {
            return interfaceC34635OooOOOO.OooO00o();
        }
        return 0L;
    }

    public ArrayList o00000(Class cls, String srcFilePath) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(srcFilePath, "srcFilePath");
        return o000000o(new File(srcFilePath), cls);
    }

    public abstract void o000000();

    public abstract void o000000O(C20738OooOOOo c20738OooOOOo);

    public ArrayList o000000o(File file, Class cls) throws Throwable {
        JsonReader jsonReader;
        JsonReader jsonReader2 = null;
        try {
            try {
                jsonReader = new JsonReader(new FileReader(file));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            ArrayList arrayList = new ArrayList();
            JsonToken jsonTokenPeek = jsonReader.peek();
            JsonToken jsonToken = JsonToken.BEGIN_OBJECT;
            Gson gson = (Gson) this.f60501OooOo0o;
            if (jsonTokenPeek == jsonToken) {
                arrayList.add(gson.fromJson(jsonReader, cls));
            } else {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    arrayList.add(gson.fromJson(jsonReader, cls));
                }
                jsonReader.endArray();
            }
            try {
                jsonReader.close();
            } catch (Exception unused) {
            }
            return arrayList;
        } catch (Exception e2) {
            e = e2;
            jsonReader2 = jsonReader;
            e.printStackTrace();
            Log.e("BackupTask", "Couldn't restore json data from file. " + C32460OooOooO.f116667OooO00o);
            if (jsonReader2 != null) {
                try {
                    jsonReader2.close();
                } catch (Exception unused2) {
                }
            }
            return new ArrayList();
        } catch (Throwable th2) {
            th = th2;
            jsonReader2 = jsonReader;
            if (jsonReader2 != null) {
                try {
                    jsonReader2.close();
                } catch (Exception unused3) {
                }
            }
            throw th;
        }
    }

    public int o00000O(List dataList, Class cls, String str) throws IOException {
        kotlin.jvm.internal.OooOOO0.OooO0oO(dataList, "dataList");
        FileWriter fileWriter = new FileWriter(str);
        try {
            int iO00000O0 = o00000O0(dataList, cls, fileWriter);
            fileWriter.close();
            return iO00000O0;
        } finally {
        }
    }

    public int o00000O0(List list, Class cls, FileWriter fileWriter) throws Throwable {
        JsonWriter jsonWriter;
        JsonWriter jsonWriter2 = null;
        try {
            try {
                jsonWriter = new JsonWriter(fileWriter);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            jsonWriter.setIndent("  ");
            jsonWriter.beginArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Gson) this.f60501OooOo0o).toJson(it.next(), cls, jsonWriter);
            }
            jsonWriter.endArray();
            try {
                jsonWriter.close();
            } catch (Exception unused) {
            }
            return 0;
        } catch (Exception e2) {
            e = e2;
            jsonWriter2 = jsonWriter;
            e.printStackTrace();
            Log.e("BackupTask", "Couldn't save data to file. " + C32460OooOooO.f116667OooO00o);
            if (jsonWriter2 == null) {
                return -999;
            }
            try {
                jsonWriter2.close();
                return -999;
            } catch (Exception unused2) {
                return -999;
            }
        } catch (Throwable th2) {
            th = th2;
            jsonWriter2 = jsonWriter;
            if (jsonWriter2 != null) {
                try {
                    jsonWriter2.close();
                } catch (Exception unused3) {
                }
            }
            throw th;
        }
    }

    public void o00000OO(Object obj, boolean z) {
        Set set = (Set) this.f60501OooOo0o;
        int size = set.size();
        if (z) {
            set.add(obj);
            if (size == 0) {
                o000OOo();
                return;
            }
            return;
        }
        if (set.remove(obj) && size == 1) {
            o000000();
        }
    }

    public abstract void o000OOo();

    public void o0O0O00(InterfaceC21400OooO0Oo interfaceC21400OooO0Oo, float f, long j) {
        InterfaceC21400OooO0Oo interfaceC21400OooO0Oo2;
        float fO0OOO0o;
        C20965OooOo0 c20965OooOo0 = (C20965OooOo0) this.f60501OooOo0o;
        c20965OooOo0.getClass();
        boolean zIsNaN = Float.isNaN(f);
        boolean z = c20965OooOo0.f60511OooO00o;
        if (zIsNaN) {
            interfaceC21400OooO0Oo2 = interfaceC21400OooO0Oo;
            fO0OOO0o = C20957OooOO0o.OooO00o(interfaceC21400OooO0Oo2, z, interfaceC21400OooO0Oo.OooOOo0());
        } else {
            interfaceC21400OooO0Oo2 = interfaceC21400OooO0Oo;
            fO0OOO0o = interfaceC21400OooO0Oo.o0OOO0o(f);
        }
        float f2 = fO0OOO0o;
        float fFloatValue = c20965OooOo0.f60513OooO0OO.OooO0OO().floatValue();
        if (fFloatValue > 0.0f) {
            long jOooO0O0 = C21348Ooooo0o.OooO0O0(fFloatValue, j);
            if (!z) {
                InterfaceC21402OooO0o0.OoooOoO(interfaceC21400OooO0Oo, jOooO0O0, f2, 0L, 124);
                return;
            }
            float fOooO0Oo = C21293OooOO0.OooO0Oo(interfaceC21400OooO0Oo2.OooOOo0());
            float fOooO0O0 = C21293OooOO0.OooO0O0(interfaceC21400OooO0Oo2.OooOOo0());
            C21397OooO00o.OooO0O0 oooO0O0OoooOo0 = interfaceC21400OooO0Oo2.OoooOo0();
            long jOooO0O02 = oooO0O0OoooOo0.OooO0O0();
            oooO0O0OoooOo0.OooO00o().OooOOo0();
            oooO0O0OoooOo0.f61919OooO00o.OooO00o(0.0f, 0.0f, fOooO0Oo, fOooO0O0, 1);
            InterfaceC21402OooO0o0.OoooOoO(interfaceC21400OooO0Oo2, jOooO0O0, f2, 0L, 124);
            oooO0O0OoooOo0.OooO00o().OooOO0o();
            oooO0O0OoooOo0.OooO0OO(jOooO0O02);
        }
    }

    public abstract void o0Oo0oo(C20738OooOOOo c20738OooOOOo, InterfaceC33636Oooo00o interfaceC33636Oooo00o);

    public AbstractC20960OooOOOO(o00oO0O o00oo0o, boolean z) {
        this.f60501OooOo0o = new C20965OooOo0(o00oo0o, z);
    }
}
