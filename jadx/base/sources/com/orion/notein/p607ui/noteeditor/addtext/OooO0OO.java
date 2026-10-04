package com.orion.notein.p607ui.noteeditor.addtext;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.webkit.MimeTypeMap;
import androidx.lifecycle.AbstractC22019Ooooooo;
import androidx.lifecycle.o0OoOo0;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o00o00O0.C25252OooO0Oo;
import o0OOo0o.C27449o00O0OoO;
import o0OoOOO0.C29046OooO0o0;
import o0oOoOo.C31039OooOO0O;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O000o.InterfaceC32511OooOOoo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.C33784o00ooo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0Oo.InterfaceC33788ooOO;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34436OooOoOO;
import oOo000Oo.C34438OooOoo0;
import oOo000Oo.OooOo;
import oOo000Oo.Oooo0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/addtext/OooO0OO;", "Landroidx/lifecycle/Ooooooo;", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class OooO0OO extends AbstractC22019Ooooooo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C33781o00o0O f74014OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Context f74015OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C33781o00o0O f74016OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C33781o00o0O f74017OooO0o0 = C33784o00ooo.OooO00o(Boolean.TRUE);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C33781o00o0O f74018OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C33781o00o0O f74019OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final C33781o00o0O f74020OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final C33769Ooooo0o f74021OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final C33769Ooooo0o f74022OooOO0o;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f74023OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f74024OooO0O0;

        public OooO00o(int i, String str) {
            this.f74023OooO00o = i;
            this.f74024OooO0O0 = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return this.f74023OooO00o == oooO00o.f74023OooO00o && this.f74024OooO0O0.equals(oooO00o.f74024OooO0O0);
        }

        public final int hashCode() {
            return this.f74024OooO0O0.hashCode() + (Integer.hashCode(this.f74023OooO00o) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ImportResult(errorCode=");
            sb.append(this.f74023OooO00o);
            sb.append(", fontFileName=");
            return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f74024OooO0O0, ")");
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.ImportFontViewModel$_allPdfFiles$1", m80623f = "ImportFontViewModel.kt", m80624l = {49}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends String>, Continuation<? super Map<String, ? extends List<? extends C31039OooOO0O>>>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public Iterator f74025OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public Collection f74026OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int f74027OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public Collection f74028OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public /* synthetic */ Object f74029OooOoOO;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO0O0 oooO0O0 = OooO0OO.this.new OooO0O0(continuation);
            oooO0O0.f74029OooOoOO = obj;
            return oooO0O0;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(List<? extends String> list, Continuation<? super Map<String, ? extends List<? extends C31039OooOO0O>>> continuation) {
            return ((OooO0O0) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(18:11|(1:13)(1:15)|14|16|(1:18)(1:19)|20|75|21|76|22|(2:26|(3:27|(1:29)|32))|34|35|36|45|(4:48|(3:82|50|86)(1:85)|84|46)|83|(1:52)(4:53|54|9|(8:55|(4:58|(1:(2:60|(1:IC)(1:63))(3:88|64|(1:94)(3:90|68|95)))|91|56)|87|69|(2:72|70)|96|73|74)(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0101, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0109, code lost:
        
            r3 = oOO00oo.C34406OooO00o.f123390OooO00o;
            r3.OooOOO0("ImportFontViewModel");
            r3.OooO0OO(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("getFilesFormMediaStoreByExt: ", r0.getMessage()), new java.lang.Object[0]);
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0156  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x014c -> B:54:0x014d). Please report as a decompilation issue!!! */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Collection arrayList;
            OooO0OO oooO0OO;
            Iterator it;
            Uri contentUri;
            Uri uri;
            String[] strArr;
            String str;
            String[] strArr2;
            Cursor cursorQuery;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f74027OooOoO;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                List list = (List) this.f74029OooOoOO;
                arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                Iterator it2 = list.iterator();
                oooO0OO = OooO0OO.this;
                it = it2;
                if (it.hasNext()) {
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Collection collection = this.f74028OooOoO0;
                Iterator it3 = this.f74025OooOo;
                Collection collection2 = this.f74026OooOo0o;
                oooO0OO = (OooO0OO) this.f74029OooOoOO;
                C32446OooOOOo.OooO0O0(obj);
                it = it3;
                arrayList = collection2;
                Object obj2 = obj;
                collection.add((List) obj2);
                if (it.hasNext()) {
                    try {
                        String str2 = (String) it.next();
                        this.f74029OooOoOO = oooO0OO;
                        Collection collection3 = arrayList;
                        this.f74026OooOo0o = collection3;
                        this.f74025OooOo = it;
                        this.f74028OooOoO0 = collection3;
                        this.f74027OooOoO = 1;
                        oooO0OO.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        if (Build.VERSION.SDK_INT >= 29) {
                            contentUri = MediaStore.Files.getContentUri("external");
                            OooOOO0.OooO0Oo(contentUri);
                        } else {
                            contentUri = MediaStore.Files.getContentUri("external");
                            OooOOO0.OooO0Oo(contentUri);
                        }
                        uri = contentUri;
                        strArr = new String[]{"_display_name", "date_added", "_data", "mime_type"};
                        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str2);
                        if (mimeTypeFromExtension == null) {
                            strArr2 = new String[]{com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("%.", str2)};
                            str = "_data LIKE ?";
                        } else {
                            str = "mime_type = ?";
                            strArr2 = new String[]{mimeTypeFromExtension};
                        }
                        Cursor cursor = cursorQuery;
                        if (cursor != null && cursor.moveToFirst()) {
                            int columnIndex = cursor.getColumnIndex("_data");
                            cursor.getColumnIndex("mime_type");
                            do {
                                File file = new File(cursor.getString(columnIndex));
                                if (C32501OooO0oO.OooO0o0(file).equalsIgnoreCase(str2)) {
                                    arrayList2.add(file);
                                }
                            } while (cursor.moveToNext());
                        }
                        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                        oO0O000.OooO00o.OooO00o(cursorQuery, null);
                        HashSet hashSet = new HashSet();
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : arrayList2) {
                            if (hashSet.add(((File) obj3).getAbsolutePath())) {
                                arrayList3.add(obj3);
                            }
                        }
                        if (arrayList3 == enumC32485OooO00o) {
                            return enumC32485OooO00o;
                        }
                        collection = arrayList;
                        obj2 = arrayList3;
                        collection.add((List) obj2);
                        if (it.hasNext()) {
                            ArrayList arrayListOooOo00 = C34428OooOOo.OooOo00((List) arrayList);
                            ArrayList<File> arrayList4 = new ArrayList();
                            for (Object obj4 : arrayListOooOo00) {
                                File file2 = (File) obj4;
                                File parentFile = file2;
                                while (true) {
                                    if (parentFile != null) {
                                        if (parentFile.isHidden()) {
                                            break;
                                        }
                                        parentFile = parentFile.getParentFile();
                                    } else if (file2.getParentFile() != null && file2.exists()) {
                                        arrayList4.add(obj4);
                                    }
                                }
                            }
                            ArrayList arrayList5 = new ArrayList(C34428OooOOo.OooOOoo(arrayList4, 10));
                            for (File file3 : arrayList4) {
                                String absolutePath = file3.getAbsolutePath();
                                OooOOO0.OooO0o(absolutePath, "getAbsolutePath(...)");
                                String name = file3.getName();
                                OooOOO0.OooO0o(name, "getName(...)");
                                arrayList5.add(new C31039OooOO0O(absolutePath, name, file3.isDirectory(), file3.lastModified(), false));
                            }
                            return Oooo0.OooO0o0(new C32443OooOOO("/storage", arrayList5));
                        }
                    } finally {
                    }
                    cursorQuery = oooO0OO.f74015OooO0Oo.getContentResolver().query(uri, strArr, str, strArr2, "date_added DESC");
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.addtext.OooO0OO$OooO0OO, reason: collision with other inner class name */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.ImportFontViewModel$currentFileNodes$1", m80623f = "ImportFontViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class C19276OooO0OO extends AbstractC32476OooO implements InterfaceC32511OooOOoo<Map<String, ? extends List<? extends C31039OooOO0O>>, File, String, Set<? extends String>, Continuation<? super List<? extends C31039OooOO0O>>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ File f74031OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Map f74032OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public /* synthetic */ Set f74033OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public /* synthetic */ String f74034OooOoO0;

        @Override // oO0O000o.InterfaceC32511OooOOoo
        public final Object Oooo0oO(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable) {
            C19276OooO0OO c19276OooO0OO = new C19276OooO0OO(5, (Continuation) serializable);
            c19276OooO0OO.f74032OooOo0o = (Map) obj;
            c19276OooO0OO.f74031OooOo = (File) obj2;
            c19276OooO0OO.f74034OooOoO0 = (String) obj3;
            c19276OooO0OO.f74033OooOoO = (Set) obj4;
            return c19276OooO0OO.invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v11, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r0v5 */
        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            ?? arrayList;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            Map map = this.f74032OooOo0o;
            File file = this.f74031OooOo;
            String str = this.f74034OooOoO0;
            Set set = this.f74033OooOoO;
            if (str.length() > 0) {
                List list = (List) map.get("/storage");
                if (list != null) {
                    arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        C31039OooOO0O c31039OooOO0O = (C31039OooOO0O) obj2;
                        if (!c31039OooOO0O.f110818OooO0OO && C33599OooOo0O.OooOoOO(c31039OooOO0O.f110817OooO0O0, str, true)) {
                            arrayList.add(obj2);
                        }
                    }
                } else {
                    arrayList = 0;
                }
            } else {
                arrayList = (List) map.get(file.getAbsolutePath());
            }
            if (arrayList == 0) {
                return C34434OooOoO.f123453OooOo0o;
            }
            Iterable<C31039OooOO0O> iterable = (Iterable) arrayList;
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
            for (C31039OooOO0O c31039OooOO0O2 : iterable) {
                arrayList2.add(C31039OooOO0O.OooO00o(c31039OooOO0O2, set.contains(c31039OooOO0O2.f110816OooO00o)));
            }
            final C29046OooO0o0 c29046OooO0o0 = new C29046OooO0o0(0);
            return OooOo.o00O0O(arrayList2, new Comparator() { // from class: o0OoOOO0.OooO0o
                @Override // java.util.Comparator
                public final int compare(Object obj3, Object obj4) {
                    return ((Number) c29046OooO0o0.invoke(obj3, obj4)).intValue();
                }
            });
        }
    }

    public static final class OooO0Oo implements InterfaceC33721OooO0o<Integer> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ OooO0OO f74035OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C33769Ooooo0o f74036OooOo0o;

        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ OooO0OO f74037OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f74038OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.addtext.OooO0OO$OooO0Oo$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.ImportFontViewModel$special$$inlined$map$1$2", m80623f = "ImportFontViewModel.kt", m80624l = {50}, m80625m = "emit")
            public static final class C19277OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f74039OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f74040OooOo0o;

                public C19277OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f74040OooOo0o = obj;
                    this.f74039OooOo |= Integer.MIN_VALUE;
                    return OooO00o.this.emit(null, this);
                }
            }

            public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, OooO0OO oooO0OO) {
                this.f74038OooOo0o = interfaceC33723OooO0oO;
                this.f74037OooOo = oooO0OO;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C19277OooO00o c19277OooO00o;
                if (continuation instanceof C19277OooO00o) {
                    c19277OooO00o = (C19277OooO00o) continuation;
                    int i = c19277OooO00o.f74039OooOo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c19277OooO00o.f74039OooOo = i - Integer.MIN_VALUE;
                    } else {
                        c19277OooO00o = new C19277OooO00o(continuation);
                    }
                }
                Object obj2 = c19277OooO00o.f74040OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c19277OooO00o.f74039OooOo;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj2);
                    List list = (List) obj;
                    ArrayList arrayList = new ArrayList();
                    for (T t : list) {
                        if (((C31039OooOO0O) t).f110820OooO0o0) {
                            arrayList.add(t);
                        }
                    }
                    int size = arrayList.size();
                    ArrayList arrayList2 = new ArrayList();
                    for (T t2 : list) {
                        if (!((C31039OooOO0O) t2).f110818OooO0OO) {
                            arrayList2.add(t2);
                        }
                    }
                    Integer num = new Integer((size == 0 || !((Boolean) this.f74037OooOo.f74017OooO0o0.getValue()).booleanValue()) ? 0 : size == arrayList2.size() ? 2 : 1);
                    c19277OooO00o.f74039OooOo = 1;
                    if (this.f74038OooOo0o.emit(num, c19277OooO00o) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj2);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooO0Oo(C33769Ooooo0o c33769Ooooo0o, OooO0OO oooO0OO) {
            this.f74036OooOo0o = c33769Ooooo0o;
            this.f74035OooOo = oooO0OO;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super Integer> interfaceC33723OooO0oO, Continuation continuation) {
            Object objCollect = this.f74036OooOo0o.f121747OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f74035OooOo), continuation);
            return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
        }
    }

    public OooO0OO(C27449o00O0OoO c27449o00O0OoO, Context context) {
        this.f74015OooO0Oo = context;
        C33781o00o0O c33781o00o0OOooO00o = C33784o00ooo.OooO00o(Environment.getExternalStorageDirectory());
        this.f74016OooO0o = c33781o00o0OOooO00o;
        this.f74018OooO0oO = c33781o00o0OOooO00o;
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        C33781o00o0O c33781o00o0OOooO00o2 = C33784o00ooo.OooO00o(c34434OooOoO);
        this.f74019OooO0oo = c33781o00o0OOooO00o2;
        C33769Ooooo0o c33769Ooooo0oOooOoO0 = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooOo(new OooO0O0(null), c33781o00o0OOooO00o2), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), C34436OooOoOO.f123455OooOo0o);
        C33781o00o0O c33781o00o0OOooO00o3 = C33784o00ooo.OooO00o(C34438OooOoo0.f123458OooOo0o);
        this.f74014OooO = c33781o00o0OOooO00o3;
        C33781o00o0O c33781o00o0OOooO00o4 = C33784o00ooo.OooO00o("");
        this.f74020OooOO0 = c33781o00o0OOooO00o4;
        C33769Ooooo0o c33769Ooooo0oOooOoO02 = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooO(c33769Ooooo0oOooOoO0, c33781o00o0OOooO00o, c33781o00o0OOooO00o4, c33781o00o0OOooO00o3, new C19276OooO0OO(5, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), c34434OooOoO);
        this.f74021OooOO0O = c33769Ooooo0oOooOoO02;
        this.f74022OooOO0o = C25252OooO0Oo.OooOoO0(new OooO0Oo(c33769Ooooo0oOooOoO02, this), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), 0);
    }

    public final void OooO0o0(String str) {
        File file = new File(str);
        C33781o00o0O c33781o00o0O = this.f74016OooO0o;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, file);
        C34438OooOoo0 c34438OooOoo0 = C34438OooOoo0.f123458OooOo0o;
        C33781o00o0O c33781o00o0O2 = this.f74014OooO;
        c33781o00o0O2.getClass();
        c33781o00o0O2.OooOO0(null, c34438OooOoo0);
    }
}
