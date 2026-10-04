package o000oo0;

import OooOo.C20485OooOoO;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.room.C22081OooO0o0;
import com.huawei.hms.network.embedded.C18361t4;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.C24019OooOO0o;
import o0000OOo.C24217OooO0O0;
import o000oo0O.C24703OooO00o;
import o000ooO.C24730OooO00o;
import o000ooO.C24731OooO0O0;
import o000ooO0.AbstractC24732OooO00o;
import o000ooo.C24746OooO00o;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o000oooO.InterfaceC24756OooO0O0;
import o000oooO.InterfaceC24757OooO0OO;
import o000oooo.C24770OooOO0;
import o00O0OO0.C24848OooO0oo;
import o0Oo00oO.C28037OooO0OO;
import oO00ooO.C32444OooOOO0;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33595OooOOo;
import oO0o0OO.AbstractC33630OooOooO;
import oO0o0OO.AbstractC33659Oooooo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33664o00000Oo;
import oO0o0OO.ExecutorC33648OoooOOO;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.InterfaceC33672o00ooo;
import oO0o0Ooo.C33822OooO0OO;
import oOo0000O.InterfaceC34412OooO0o;
import oOo0000O.InterfaceC34415OooO0oo;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34436OooOoOO;
import oOo000Oo.C34438OooOoo0;
import oOoo0.InterfaceC34595OooO0Oo;

/* JADX INFO: renamed from: o000oo0.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, m80612d2 = {"Lo000oo0/OooOo0O;", "", "<init>", "()V", "OooO0OO", "OooO00o", "OooO0Oo", "OooO0O0", "room-runtime_release"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
public abstract class AbstractC24673OooOo0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public C33822OooO0OO f83578OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public InterfaceC34415OooO0oo f83579OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Executor f83580OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Oooo0 f83581OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public androidx.room.OooO0OO f83582OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public C24671OooOOoo f83583OooO0o0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f83585OooO0oo;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C24703OooO00o f83584OooO0oO = new C24703OooO00o(new C24675OooO0o0(0, this, AbstractC24673OooOo0O.class, "onClosed", "onClosed()V", 0));

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final ThreadLocal<Integer> f83577OooO = new ThreadLocal<>();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final LinkedHashMap f83586OooOO0 = new LinkedHashMap();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f83587OooOO0O = true;

    /* JADX INFO: renamed from: o000oo0.OooOo0O$OooO00o */
    public static class OooO00o<T extends AbstractC24673OooOo0O> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public boolean f83588OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final InterfaceC34595OooO0Oo<T> f83589OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Context f83590OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final String f83591OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final ArrayList f83592OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Executor f83593OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final ArrayList f83594OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Executor f83595OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public C24848OooO0oo f83596OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final OooO0OO f83597OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final long f83598OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final C24674OooO0Oo f83599OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final LinkedHashSet f83600OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final LinkedHashSet f83601OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final ArrayList f83602OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public boolean f83603OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public final boolean f83604OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public boolean f83605OooOOo0;

        public OooO00o(Context context, String str, Class cls) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
            this.f83592OooO0Oo = new ArrayList();
            this.f83594OooO0o0 = new ArrayList();
            this.f83597OooOO0 = OooO0OO.f83607OooOo0o;
            this.f83598OooOO0O = -1L;
            this.f83599OooOO0o = new C24674OooO0Oo();
            this.f83601OooOOO0 = new LinkedHashSet();
            this.f83600OooOOO = new LinkedHashSet();
            this.f83602OooOOOO = new ArrayList();
            this.f83603OooOOOo = true;
            this.f83604OooOOo = true;
            this.f83589OooO00o = C24217OooO0O0.OooO0oO(cls);
            this.f83590OooO0O0 = context;
            this.f83591OooO0OO = str;
        }

        public final void OooO00o(AbstractC24732OooO00o... abstractC24732OooO00oArr) {
            for (AbstractC24732OooO00o abstractC24732OooO00o : abstractC24732OooO00oArr) {
                LinkedHashSet linkedHashSet = this.f83600OooOOO;
                linkedHashSet.add(Integer.valueOf(abstractC24732OooO00o.f83864OooO00o));
                linkedHashSet.add(Integer.valueOf(abstractC24732OooO00o.f83865OooO0O0));
            }
            AbstractC24732OooO00o[] migrations = (AbstractC24732OooO00o[]) Arrays.copyOf(abstractC24732OooO00oArr, abstractC24732OooO00oArr.length);
            C24674OooO0Oo c24674OooO0Oo = this.f83599OooOO0o;
            c24674OooO0Oo.getClass();
            kotlin.jvm.internal.OooOOO0.OooO0oO(migrations, "migrations");
            for (AbstractC24732OooO00o abstractC24732OooO00o2 : migrations) {
                c24674OooO0Oo.OooO00o(abstractC24732OooO00o2);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:105:0x0260, code lost:
        
            throw new java.lang.IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final T OooO0O0() {
            String name;
            AbstractC24678OooOoO0 abstractC24678OooOoO0;
            Executor executorC33648OoooOOO;
            InterfaceC34415OooO0oo interfaceC34415OooO0ooPlus;
            boolean zContainsKey;
            Executor executor = this.f83593OooO0o;
            if (executor == null && this.f83595OooO0oO == null) {
                OooOOO0.OooO00o oooO00o = OooOOO0.OooO0O0.f58405OooOoO0;
                this.f83595OooO0oO = oooO00o;
                this.f83593OooO0o = oooO00o;
            } else if (executor != null && this.f83595OooO0oO == null) {
                this.f83595OooO0oO = executor;
            } else if (executor == null) {
                this.f83593OooO0o = this.f83595OooO0oO;
            }
            LinkedHashSet migrationStartAndEndVersions = this.f83600OooOOO;
            LinkedHashSet migrationsNotRequiredFrom = this.f83601OooOOO0;
            kotlin.jvm.internal.OooOOO0.OooO0oO(migrationStartAndEndVersions, "migrationStartAndEndVersions");
            kotlin.jvm.internal.OooOOO0.OooO0oO(migrationsNotRequiredFrom, "migrationsNotRequiredFrom");
            if (!migrationStartAndEndVersions.isEmpty()) {
                Iterator it = migrationStartAndEndVersions.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    if (migrationsNotRequiredFrom.contains(Integer.valueOf(iIntValue))) {
                        throw new IllegalArgumentException(C21532OooOOo.OooO0OO(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: ").toString());
                    }
                }
            }
            InterfaceC24757OooO0OO.InterfaceC19651OooO0OO c24770OooOO0 = this.f83596OooO0oo;
            if (c24770OooOO0 == null) {
                c24770OooOO0 = new C24770OooOO0();
            }
            InterfaceC24757OooO0OO.InterfaceC19651OooO0OO interfaceC19651OooO0OO = c24770OooOO0;
            if (this.f83598OooOO0O > 0) {
                if (this.f83591OooO0OO != null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
            }
            ArrayList arrayList = this.f83592OooO0Oo;
            boolean z = this.f83588OooO;
            OooO0OO oooO0OO = this.f83597OooOO0;
            oooO0OO.getClass();
            Context context = this.f83590OooO0O0;
            kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
            if (oooO0OO == OooO0OO.f83607OooOo0o) {
                Object systemService = context.getSystemService(C18361t4.f56218b);
                ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                oooO0OO = (activityManager == null || activityManager.isLowRamDevice()) ? OooO0OO.f83606OooOo : OooO0OO.f83609OooOoO0;
            }
            Executor executor2 = this.f83593OooO0o;
            if (executor2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Executor executor3 = this.f83595OooO0oO;
            if (executor3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            C24656OooO0O0 c24656OooO0O0 = new C24656OooO0O0(context, this.f83591OooO0OO, interfaceC19651OooO0OO, this.f83599OooOO0o, arrayList, z, oooO0OO, executor2, executor3, null, this.f83603OooOOOo, this.f83605OooOOo0, migrationsNotRequiredFrom, null, null, null, this.f83594OooO0o0, this.f83602OooOOOO, false, null, null);
            c24656OooO0O0.f83537OooOo0O = this.f83604OooOOo;
            Class clsOooO0Oo = C24217OooO0O0.OooO0Oo(this.f83589OooO00o);
            Package r4 = clsOooO0Oo.getPackage();
            if (r4 == null || (name = r4.getName()) == null) {
                name = "";
            }
            String canonicalName = clsOooO0Oo.getCanonicalName();
            kotlin.jvm.internal.OooOOO0.OooO0Oo(canonicalName);
            if (name.length() != 0) {
                canonicalName = canonicalName.substring(name.length() + 1);
                kotlin.jvm.internal.OooOOO0.OooO0o(canonicalName, "substring(...)");
            }
            String strConcat = C33595OooOOo.OooOo0(canonicalName, FilenameUtils.EXTENSION_SEPARATOR, '_').concat("_Impl");
            try {
                Class<?> cls = Class.forName(name.length() == 0 ? strConcat : name + FilenameUtils.EXTENSION_SEPARATOR + strConcat, true, clsOooO0Oo.getClassLoader());
                kotlin.jvm.internal.OooOOO0.OooO0o0(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.util.KClassUtil.findAndInstantiateDatabaseImpl>");
                T t = (T) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                t.getClass();
                t.f83587OooOO0O = c24656OooO0O0.f83537OooOo0O;
                try {
                    InterfaceC24677OooOoO interfaceC24677OooOoOOooO0o = t.OooO0o();
                    kotlin.jvm.internal.OooOOO0.OooO0o0(interfaceC24677OooOoOOooO0o, "null cannot be cast to non-null type androidx.room.RoomOpenDelegate");
                    abstractC24678OooOoO0 = (AbstractC24678OooOoO0) interfaceC24677OooOoOOooO0o;
                } catch (C32444OooOOO0 unused) {
                    abstractC24678OooOoO0 = null;
                }
                t.f83583OooO0o0 = abstractC24678OooOoO0 == null ? new C24671OooOOoo(c24656OooO0O0, new C24672OooOo0(t, 0)) : new C24671OooOOoo(c24656OooO0O0, abstractC24678OooOoO0);
                t.f83582OooO0o = t.OooO0o0();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Set<Class<Object>> setOooOO0o = t.OooOO0o();
                ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(setOooOO0o, 10));
                Iterator<T> it2 = setOooOO0o.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(C24217OooO0O0.OooO0oO((Class) it2.next()));
                }
                Set setO0OO00O = oOo000Oo.OooOo.o0OO00O(arrayList2);
                List<Object> list = c24656OooO0O0.f83532OooOOo;
                int size = list.size();
                boolean[] zArr = new boolean[size];
                Iterator it3 = setO0OO00O.iterator();
                while (true) {
                    int i = -1;
                    if (!it3.hasNext()) {
                        int size2 = list.size() - 1;
                        if (size2 >= 0) {
                            while (true) {
                                int i2 = size2 - 1;
                                if (size2 >= size || !zArr[size2]) {
                                    break;
                                }
                                if (i2 < 0) {
                                    break;
                                }
                                size2 = i2;
                            }
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(oOo000Oo.Oooo0.OooO0Oo(linkedHashMap.size()));
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            linkedHashMap2.put(C24217OooO0O0.OooO0Oo((InterfaceC34595OooO0Oo) entry.getKey()), entry.getValue());
                        }
                        for (AbstractC24732OooO00o abstractC24732OooO00o : t.OooO0oo(linkedHashMap2)) {
                            int i3 = abstractC24732OooO00o.f83864OooO00o;
                            C24674OooO0Oo c24674OooO0Oo = c24656OooO0O0.f83520OooO0Oo;
                            LinkedHashMap linkedHashMap3 = c24674OooO0Oo.f83610OooO00o;
                            if (linkedHashMap3.containsKey(Integer.valueOf(i3))) {
                                Map map = (Map) linkedHashMap3.get(Integer.valueOf(i3));
                                if (map == null) {
                                    map = C34436OooOoOO.f123455OooOo0o;
                                }
                                zContainsKey = map.containsKey(Integer.valueOf(abstractC24732OooO00o.f83865OooO0O0));
                            } else {
                                zContainsKey = false;
                            }
                            if (!zContainsKey) {
                                c24674OooO0Oo.OooO00o(abstractC24732OooO00o);
                            }
                        }
                        Set<Map.Entry<Class<?>, List<Class<?>>>> setEntrySet = t.OooOOO0().entrySet();
                        int iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(setEntrySet, 10));
                        if (iOooO0Oo < 16) {
                            iOooO0Oo = 16;
                        }
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap(iOooO0Oo);
                        Iterator<T> it4 = setEntrySet.iterator();
                        while (it4.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it4.next();
                            Class cls2 = (Class) entry2.getKey();
                            List list2 = (List) entry2.getValue();
                            InterfaceC34595OooO0Oo interfaceC34595OooO0OoOooO0oO = C24217OooO0O0.OooO0oO(cls2);
                            List list3 = list2;
                            ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(list3, 10));
                            Iterator it5 = list3.iterator();
                            while (it5.hasNext()) {
                                arrayList3.add(C24217OooO0O0.OooO0oO((Class) it5.next()));
                            }
                            linkedHashMap4.put(interfaceC34595OooO0OoOooO0oO, arrayList3);
                        }
                        List<Object> list4 = c24656OooO0O0.f83533OooOOo0;
                        boolean[] zArr2 = new boolean[list4.size()];
                        for (Map.Entry entry3 : linkedHashMap4.entrySet()) {
                            InterfaceC34595OooO0Oo interfaceC34595OooO0Oo = (InterfaceC34595OooO0Oo) entry3.getKey();
                            for (InterfaceC34595OooO0Oo kclass : (List) entry3.getValue()) {
                                int size3 = list4.size() - 1;
                                if (size3 >= 0) {
                                    while (true) {
                                        int i4 = size3 - 1;
                                        if (kclass.OooO0oo(list4.get(size3))) {
                                            zArr2[size3] = true;
                                            break;
                                        }
                                        if (i4 < 0) {
                                            break;
                                        }
                                        size3 = i4;
                                    }
                                } else {
                                    size3 = -1;
                                }
                                if (size3 < 0) {
                                    throw new IllegalArgumentException(("A required type converter (" + kclass.OooO0Oo() + ") for " + interfaceC34595OooO0Oo.OooO0Oo() + " is missing in the database configuration.").toString());
                                }
                                Object converter = list4.get(size3);
                                kotlin.jvm.internal.OooOOO0.OooO0oO(kclass, "kclass");
                                kotlin.jvm.internal.OooOOO0.OooO0oO(converter, "converter");
                                t.f83586OooOO0.put(kclass, converter);
                            }
                        }
                        int size4 = list4.size() - 1;
                        if (size4 >= 0) {
                            while (true) {
                                int i5 = size4 - 1;
                                if (!zArr2[size4]) {
                                    throw new IllegalArgumentException(C20485OooOoO.OooO0O0("Unexpected type converter ", list4.get(size4), ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder."));
                                }
                                if (i5 < 0) {
                                    break;
                                }
                                size4 = i5;
                            }
                        }
                        InterfaceC34415OooO0oo interfaceC34415OooO0oo = c24656OooO0O0.f83535OooOo0;
                        if (interfaceC34415OooO0oo != null) {
                            InterfaceC34415OooO0oo.OooO0O0 oooO0O0 = interfaceC34415OooO0oo.get(InterfaceC34412OooO0o.OooO00o.f123422OooOo0o);
                            kotlin.jvm.internal.OooOOO0.OooO0o0(oooO0O0, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
                            AbstractC33630OooOooO abstractC33630OooOooO = (AbstractC33630OooOooO) oooO0O0;
                            AbstractC33659Oooooo abstractC33659Oooooo = abstractC33630OooOooO instanceof AbstractC33659Oooooo ? (AbstractC33659Oooooo) abstractC33630OooOooO : null;
                            if (abstractC33659Oooooo == null || (executorC33648OoooOOO = abstractC33659Oooooo.o000OOoO()) == null) {
                                executorC33648OoooOOO = new ExecutorC33648OoooOOO(abstractC33630OooOooO);
                            }
                            t.f83580OooO0OO = executorC33648OoooOOO;
                            t.f83581OooO0Oo = new Oooo0(executorC33648OoooOOO);
                            t.f83578OooO00o = C33633Oooo0.OooO00o(interfaceC34415OooO0oo.plus(new C33664o00000Oo((InterfaceC33672o00ooo) interfaceC34415OooO0oo.get(InterfaceC33672o00ooo.OooO00o.f121379OooOo0o))));
                            if (t.OooOOO()) {
                                C33822OooO0OO c33822OooO0OO = t.f83578OooO00o;
                                if (c33822OooO0OO == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("coroutineScope");
                                    throw null;
                                }
                                interfaceC34415OooO0ooPlus = c33822OooO0OO.f121916OooOo0o.plus(abstractC33630OooOooO.o000OOo0(1));
                            } else {
                                C33822OooO0OO c33822OooO0OO2 = t.f83578OooO00o;
                                if (c33822OooO0OO2 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("coroutineScope");
                                    throw null;
                                }
                                interfaceC34415OooO0ooPlus = c33822OooO0OO2.f121916OooOo0o;
                            }
                            t.f83579OooO0O0 = interfaceC34415OooO0ooPlus;
                        } else {
                            t.f83580OooO0OO = c24656OooO0O0.f83524OooO0oo;
                            t.f83581OooO0Oo = new Oooo0(c24656OooO0O0.f83516OooO);
                            Executor executor4 = t.f83580OooO0OO;
                            if (executor4 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("internalQueryExecutor");
                                throw null;
                            }
                            C33822OooO0OO c33822OooO0OOOooO00o = C33633Oooo0.OooO00o(InterfaceC34415OooO0oo.OooO00o.OooO00o(C28037OooO0OO.OooO0O0(executor4), o00000.OooOO0.OooO00o()));
                            t.f83578OooO00o = c33822OooO0OOOooO00o;
                            Oooo0 oooo0 = t.f83581OooO0Oo;
                            if (oooo0 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("internalTransactionExecutor");
                                throw null;
                            }
                            t.f83579OooO0O0 = c33822OooO0OOOooO00o.f121916OooOo0o.plus(C28037OooO0OO.OooO0O0(oooo0));
                        }
                        t.f83585OooO0oo = c24656OooO0O0.f83521OooO0o;
                        C24671OooOOoo c24671OooOOoo = t.f83583OooO0o0;
                        if (c24671OooOOoo == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("connectionManager");
                            throw null;
                        }
                        InterfaceC24757OooO0OO interfaceC24757OooO0OOOooOO0 = c24671OooOOoo.OooOO0();
                        if (interfaceC24757OooO0OOOooOO0 == null) {
                            interfaceC24757OooO0OOOooOO0 = null;
                            break;
                        }
                        while (!(interfaceC24757OooO0OOOooOO0 instanceof C24731OooO0O0)) {
                            if (!(interfaceC24757OooO0OOOooOO0 instanceof InterfaceC24657OooO0OO)) {
                                interfaceC24757OooO0OOOooOO0 = null;
                                break;
                            }
                            interfaceC24757OooO0OOOooOO0 = ((InterfaceC24657OooO0OO) interfaceC24757OooO0OOOooOO0).OooO00o();
                        }
                        C24671OooOOoo c24671OooOOoo2 = t.f83583OooO0o0;
                        if (c24671OooOOoo2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("connectionManager");
                            throw null;
                        }
                        InterfaceC24757OooO0OO interfaceC24757OooO0OOOooOO02 = c24671OooOOoo2.OooOO0();
                        if (interfaceC24757OooO0OOOooOO02 == null) {
                            interfaceC24757OooO0OOOooOO02 = null;
                            break;
                        }
                        while (!(interfaceC24757OooO0OOOooOO02 instanceof C24730OooO00o)) {
                            if (!(interfaceC24757OooO0OOOooOO02 instanceof InterfaceC24657OooO0OO)) {
                                interfaceC24757OooO0OOOooOO02 = null;
                                break;
                            }
                            interfaceC24757OooO0OOOooOO02 = ((InterfaceC24657OooO0OO) interfaceC24757OooO0OOOooOO02).OooO00o();
                        }
                        if (((C24730OooO00o) interfaceC24757OooO0OOOooOO02) != null) {
                            throw null;
                        }
                        Intent intent = c24656OooO0O0.f83525OooOO0;
                        if (intent != null) {
                            String str = c24656OooO0O0.f83518OooO0O0;
                            if (str == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            androidx.room.OooO0OO oooO0OOOooOO0 = t.OooOO0();
                            Context context2 = c24656OooO0O0.f83517OooO00o;
                            kotlin.jvm.internal.OooOOO0.OooO0oO(context2, "context");
                            oooO0OOOooOO0.f66181OooO = intent;
                            oooO0OOOooOO0.f66190OooOO0 = new C22081OooO0o0(context2, str, oooO0OOOooOO0);
                        }
                        return t;
                    }
                    InterfaceC34595OooO0Oo interfaceC34595OooO0Oo2 = (InterfaceC34595OooO0Oo) it3.next();
                    int size5 = list.size() - 1;
                    if (size5 >= 0) {
                        while (true) {
                            int i6 = size5 - 1;
                            if (interfaceC34595OooO0Oo2.OooO0oo(list.get(size5))) {
                                zArr[size5] = true;
                                i = size5;
                                break;
                            }
                            if (i6 < 0) {
                                break;
                            }
                            size5 = i6;
                        }
                    }
                    if (i < 0) {
                        throw new IllegalArgumentException(("A required auto migration spec (" + interfaceC34595OooO0Oo2.OooO0Oo() + ") is missing in the database configuration.").toString());
                    }
                    linkedHashMap.put(interfaceC34595OooO0Oo2, list.get(i));
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("Cannot find implementation for " + clsOooO0Oo.getCanonicalName() + ". " + strConcat + " does not exist. Is Room annotation processor correctly configured?", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot access the constructor " + clsOooO0Oo.getCanonicalName(), e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Failed to create an instance of " + clsOooO0Oo.getCanonicalName(), e3);
            }
        }
    }

    /* JADX INFO: renamed from: o000oo0.OooOo0O$OooO0O0 */
    public static abstract class OooO0O0 {
        public void OooO00o(InterfaceC24756OooO0O0 db) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(db, "db");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: o000oo0.OooOo0O$OooO0OO */
    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO0OO f83606OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0OO f83607OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final /* synthetic */ OooO0OO[] f83608OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO0OO f83609OooOoO0;

        static {
            OooO0OO oooO0OO = new OooO0OO("AUTOMATIC", 0);
            f83607OooOo0o = oooO0OO;
            OooO0OO oooO0OO2 = new OooO0OO("TRUNCATE", 1);
            f83606OooOo = oooO0OO2;
            OooO0OO oooO0OO3 = new OooO0OO("WRITE_AHEAD_LOGGING", 2);
            f83609OooOoO0 = oooO0OO3;
            OooO0OO[] oooO0OOArr = {oooO0OO, oooO0OO2, oooO0OO3};
            f83608OooOoO = oooO0OOArr;
            OooO.OooO00o.OooO0O0(oooO0OOArr);
        }

        public OooO0OO() {
            throw null;
        }

        public static OooO0OO valueOf(String str) {
            return (OooO0OO) Enum.valueOf(OooO0OO.class, str);
        }

        public static OooO0OO[] values() {
            return (OooO0OO[]) f83608OooOoO.clone();
        }
    }

    /* JADX INFO: renamed from: o000oo0.OooOo0O$OooO0Oo, reason: case insensitive filesystem */
    public static class C24674OooO0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final LinkedHashMap f83610OooO00o = new LinkedHashMap();

        public final void OooO00o(AbstractC24732OooO00o migration) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(migration, "migration");
            LinkedHashMap linkedHashMap = this.f83610OooO00o;
            Integer numValueOf = Integer.valueOf(migration.f83864OooO00o);
            Object treeMap = linkedHashMap.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap();
                linkedHashMap.put(numValueOf, treeMap);
            }
            TreeMap treeMap2 = (TreeMap) treeMap;
            int i = migration.f83865OooO0O0;
            if (treeMap2.containsKey(Integer.valueOf(i))) {
                Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i)) + " with " + migration);
            }
            treeMap2.put(Integer.valueOf(i), migration);
        }
    }

    /* JADX INFO: renamed from: o000oo0.OooOo0O$OooO0o0, reason: case insensitive filesystem */
    public /* synthetic */ class C24675OooO0o0 extends C24019OooOO0o implements oO0O000o.OooO00o<C32460OooOooO> {
        @Override // oO0O000o.OooO00o
        public final C32460OooOooO invoke() throws Exception {
            AbstractC24673OooOo0O abstractC24673OooOo0O = (AbstractC24673OooOo0O) this.receiver;
            C33822OooO0OO c33822OooO0OO = abstractC24673OooOo0O.f83578OooO00o;
            if (c33822OooO0OO == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("coroutineScope");
                throw null;
            }
            C33633Oooo0.OooO0Oo(c33822OooO0OO, null);
            C22081OooO0o0 c22081OooO0o0 = abstractC24673OooOo0O.OooOO0().f66190OooOO0;
            if (c22081OooO0o0 != null && c22081OooO0o0.f66207OooO0o0.compareAndSet(false, true)) {
                c22081OooO0o0.f66203OooO0O0.OooO0O0(c22081OooO0o0.f66201OooO);
                try {
                    androidx.room.OooO0O0 oooO0O0 = c22081OooO0o0.f66208OooO0oO;
                    if (oooO0O0 != null) {
                        oooO0O0.OooOo00(c22081OooO0o0.f66210OooOO0, c22081OooO0o0.f66206OooO0o);
                    }
                } catch (RemoteException e) {
                    Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e);
                }
                c22081OooO0o0.f66204OooO0OO.unbindService(c22081OooO0o0.f66211OooOO0O);
            }
            C24671OooOOoo c24671OooOOoo = abstractC24673OooOo0O.f83583OooO0o0;
            if (c24671OooOOoo != null) {
                c24671OooOOoo.f83567OooO0o.close();
                return C32460OooOooO.f116667OooO00o;
            }
            kotlin.jvm.internal.OooOOO0.OooOOOO("connectionManager");
            throw null;
        }
    }

    public final InterfaceC33636Oooo00o OooO() {
        C33822OooO0OO c33822OooO0OO = this.f83578OooO00o;
        if (c33822OooO0OO != null) {
            return c33822OooO0OO;
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("coroutineScope");
        throw null;
    }

    public final void OooO00o() {
        if (this.f83585OooO0oo) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void OooO0O0() {
        if (OooOOO() && !OooOOOO() && this.f83577OooO.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void OooO0OO() {
        OooO00o();
        OooO00o();
        InterfaceC24756OooO0O0 interfaceC24756OooO0O0OooooOO = OooOO0O().OooooOO();
        if (!interfaceC24756OooO0O0OooooOO.o000O00()) {
            o000oo0o.OooOo.OooO00o(new C24654OooO(OooOO0(), null));
        }
        if (interfaceC24756OooO0O0OooooOO.o000O0Oo()) {
            interfaceC24756OooO0O0OooooOO.OooOoo();
        } else {
            interfaceC24756OooO0O0OooooOO.OooOOo();
        }
    }

    public final void OooO0Oo() throws Exception {
        C24703OooO00o c24703OooO00o = this.f83584OooO0oO;
        synchronized (c24703OooO00o) {
            if (c24703OooO00o.f83747OooO0OO.compareAndSet(false, true)) {
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                while (c24703OooO00o.f83746OooO0O0.get() != 0) {
                }
                c24703OooO00o.f83745OooO00o.invoke();
            }
        }
    }

    public InterfaceC24677OooOoO OooO0o() {
        throw new C32444OooOOO0();
    }

    public abstract androidx.room.OooO0OO OooO0o0();

    public InterfaceC24757OooO0OO OooO0oO(C24656OooO0O0 config) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(config, "config");
        throw new C32444OooOOO0();
    }

    public List OooO0oo(LinkedHashMap linkedHashMap) {
        return C34434OooOoO.f123453OooOo0o;
    }

    public final androidx.room.OooO0OO OooOO0() {
        androidx.room.OooO0OO oooO0OO = this.f83582OooO0o;
        if (oooO0OO != null) {
            return oooO0OO;
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("internalTracker");
        throw null;
    }

    public final InterfaceC24757OooO0OO OooOO0O() {
        C24671OooOOoo c24671OooOOoo = this.f83583OooO0o0;
        if (c24671OooOOoo == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("connectionManager");
            throw null;
        }
        InterfaceC24757OooO0OO interfaceC24757OooO0OOOooOO0 = c24671OooOOoo.OooOO0();
        if (interfaceC24757OooO0OOOooOO0 != null) {
            return interfaceC24757OooO0OOOooOO0;
        }
        throw new IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
    }

    public Set<Class<Object>> OooOO0o() {
        return C34438OooOoo0.f123458OooOo0o;
    }

    public final boolean OooOOO() {
        C24671OooOOoo c24671OooOOoo = this.f83583OooO0o0;
        if (c24671OooOOoo != null) {
            return c24671OooOOoo.OooOO0() != null;
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("connectionManager");
        throw null;
    }

    public Map<Class<?>, List<Class<?>>> OooOOO0() {
        return C34436OooOoOO.f123455OooOo0o;
    }

    public final boolean OooOOOO() {
        return OooOOo() && OooOO0O().OooooOO().o000O00();
    }

    public final void OooOOOo() {
        OooOO0O().OooooOO().o0000Ooo();
        if (OooOOOO()) {
            return;
        }
        androidx.room.OooO0OO oooO0OOOooOO0 = OooOO0();
        oooO0OOOooOO0.f66184OooO0OO.OooO0o0(oooO0OOOooOO0.f66186OooO0o, oooO0OOOooOO0.f66188OooO0oO);
    }

    public final boolean OooOOo() {
        C24671OooOOoo c24671OooOOoo = this.f83583OooO0o0;
        if (c24671OooOOoo == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("connectionManager");
            throw null;
        }
        InterfaceC24756OooO0O0 interfaceC24756OooO0O0 = c24671OooOOoo.f83569OooO0oO;
        if (interfaceC24756OooO0O0 != null) {
            return interfaceC24756OooO0O0.isOpen();
        }
        return false;
    }

    public final void OooOOo0(InterfaceC24747OooO0O0 connection) throws Exception {
        kotlin.jvm.internal.OooOOO0.OooO0oO(connection, "connection");
        androidx.room.OooO0OO oooO0OOOooOO0 = OooOO0();
        C24695OoooO00 c24695OoooO00 = oooO0OOOooOO0.f66184OooO0OO;
        c24695OoooO00.getClass();
        InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = connection.o0ooOOo("PRAGMA query_only");
        try {
            interfaceC24749OooO0OoO0ooOOo.o00oO0o();
            boolean zO0000oO0 = interfaceC24749OooO0OoO0ooOOo.o0000oO0();
            interfaceC24749OooO0OoO0ooOOo.close();
            if (!zO0000oO0) {
                C24746OooO00o.OooO0o0(connection, "PRAGMA temp_store = MEMORY");
                C24746OooO00o.OooO0o0(connection, "PRAGMA recursive_triggers = 1");
                C24746OooO00o.OooO0o0(connection, "DROP TABLE IF EXISTS room_table_modification_log");
                if (c24695OoooO00.f83677OooO0Oo) {
                    C24746OooO00o.OooO0o0(connection, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    C24746OooO00o.OooO0o0(connection, C33595OooOOo.OooOo0O("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                C24665OooOO0o c24665OooOO0o = c24695OoooO00.f83681OooO0oo;
                ReentrantLock reentrantLock = c24665OooOO0o.f83551OooO00o;
                reentrantLock.lock();
                try {
                    c24665OooOO0o.f83554OooO0Oo = true;
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (oooO0OOOooOO0.f66191OooOO0O) {
                try {
                    C22081OooO0o0 c22081OooO0o0 = oooO0OOOooOO0.f66190OooOO0;
                    if (c22081OooO0o0 != null) {
                        Intent intent = oooO0OOOooOO0.f66181OooO;
                        if (intent == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        if (c22081OooO0o0.f66207OooO0o0.compareAndSet(true, false)) {
                            c22081OooO0o0.f66204OooO0OO.bindService(intent, c22081OooO0o0.f66211OooOO0O, 1);
                            androidx.room.OooO0OO oooO0OO = c22081OooO0o0.f66203OooO0O0;
                            C22081OooO0o0.OooO0O0 observer = c22081OooO0o0.f66201OooO;
                            kotlin.jvm.internal.OooOOO0.OooO0oO(observer, "observer");
                            oooO0OO.OooO00o(observer);
                        }
                        C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
        }
    }

    public final void OooOOoo() {
        OooOO0O().OooooOO().o00000O0();
    }

    public final Object OooOo00(boolean z, InterfaceC32508OooOOOo interfaceC32508OooOOOo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C24671OooOOoo c24671OooOOoo = this.f83583OooO0o0;
        if (c24671OooOOoo != null) {
            return c24671OooOOoo.f83567OooO0o.OoooOoO(z, interfaceC32508OooOOOo, abstractC32479OooO0OO);
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("connectionManager");
        throw null;
    }
}
