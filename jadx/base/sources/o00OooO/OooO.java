package o00OooO;

import OooOo.OooO00o;
import Oooo0oO.C21111o0ooOoO;
import Oooo0oO.o0Oo0oo;
import com.bumptech.glide.EnumC22252OooO0oo;
import com.bumptech.glide.OooO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o00Ooo0o.C25111OooO;
import o00Ooo0o.InterfaceC25115OooO0Oo;
import o00Ooo0o.InterfaceC25116OooO0o;
import o00Ooo0o.InterfaceC25123OooOOO0;
import o00OooO.OooOOO0;
import o00OoooO.InterfaceC25186OooOOo;
import o00o0000.C25240OooO0OO;
import o00o00o.C25274OooO00o;
import o00o0O0.C25309OooO0O0;

/* JADX INFO: loaded from: classes5.dex */
public final class OooO<Transcode> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public C25111OooO f85392OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f85393OooO00o = new ArrayList();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList f85394OooO0O0 = new ArrayList();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public com.bumptech.glide.OooO0o f85395OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Object f85396OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f85397OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f85398OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public Class<?> f85399OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public OooOOO0.OooO0OO f85400OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public C25309OooO0O0 f85401OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public Class<Transcode> f85402OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f85403OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public InterfaceC25116OooO0o f85404OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f85405OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public EnumC22252OooO0oo f85406OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public AbstractC25133OooOO0o f85407OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f85408OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f85409OooOOo0;

    public final ArrayList OooO00o() {
        boolean z = this.f85405OooOOO0;
        ArrayList arrayList = this.f85394OooO0O0;
        if (!z) {
            this.f85405OooOOO0 = true;
            arrayList.clear();
            ArrayList arrayListOooO0O0 = OooO0O0();
            int size = arrayListOooO0O0.size();
            for (int i = 0; i < size; i++) {
                InterfaceC25186OooOOo.OooO00o oooO00o = (InterfaceC25186OooOOo.OooO00o) arrayListOooO0O0.get(i);
                if (!arrayList.contains(oooO00o.f85729OooO00o)) {
                    arrayList.add(oooO00o.f85729OooO00o);
                }
                int i2 = 0;
                while (true) {
                    List<InterfaceC25116OooO0o> list = oooO00o.f85730OooO0O0;
                    if (i2 < list.size()) {
                        if (!arrayList.contains(list.get(i2))) {
                            arrayList.add(list.get(i2));
                        }
                        i2++;
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList OooO0O0() {
        boolean z = this.f85403OooOO0o;
        ArrayList arrayList = this.f85393OooO00o;
        if (!z) {
            this.f85403OooOO0o = true;
            arrayList.clear();
            List listOooO0o = this.f85395OooO0OO.OooO00o().OooO0o(this.f85396OooO0Oo);
            int size = listOooO0o.size();
            for (int i = 0; i < size; i++) {
                InterfaceC25186OooOOo.OooO00o OooO00o2 = ((InterfaceC25186OooOOo) listOooO0o.get(i)).OooO00o(this.f85396OooO0Oo, this.f85398OooO0o0, this.f85397OooO0o, this.f85392OooO);
                if (OooO00o2 != null) {
                    arrayList.add(OooO00o2);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r3v16 o00OooO.OooOo0<?, ?, ?>
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    public final <Data> o00OooO.C25143OooOo0<Data, ?, Transcode> OooO0OO(java.lang.Class<Data> r18) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o00OooO.OooO.OooO0OO(java.lang.Class):o00OooO.OooOo0");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r1 = (o00Ooo0o.InterfaceC25115OooO0Oo<X>) r3.f86024OooO0O0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <X> InterfaceC25115OooO0Oo<X> OooO0Oo(X x) throws OooO.C22248OooO0o0 {
        InterfaceC25115OooO0Oo<X> interfaceC25115OooO0Oo;
        C25274OooO00o c25274OooO00o = this.f85395OooO0OO.OooO00o().f67103OooO0O0;
        Class<?> cls = x.getClass();
        synchronized (c25274OooO00o) {
            Iterator it = c25274OooO00o.f86022OooO00o.iterator();
            while (true) {
                if (!it.hasNext()) {
                    interfaceC25115OooO0Oo = null;
                    break;
                }
                C25274OooO00o.C19691OooO00o c19691OooO00o = (C25274OooO00o.C19691OooO00o) it.next();
                if (c19691OooO00o.f86023OooO00o.isAssignableFrom(cls)) {
                    break;
                }
            }
        }
        if (interfaceC25115OooO0Oo != null) {
            return interfaceC25115OooO0Oo;
        }
        throw new OooO.C22248OooO0o0(C21111o0ooOoO.OooO0O0(x.getClass(), "Failed to find source encoder for data class: "));
    }

    public final <Z> InterfaceC25123OooOOO0<Z> OooO0o0(Class<Z> cls) {
        InterfaceC25123OooOOO0<Z> interfaceC25123OooOOO0 = (InterfaceC25123OooOOO0) this.f85401OooOO0.get(cls);
        if (interfaceC25123OooOOO0 == null) {
            Iterator it = ((OooO00o.C18962OooO00o) this.f85401OooOO0.entrySet()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    interfaceC25123OooOOO0 = (InterfaceC25123OooOOO0) entry.getValue();
                    break;
                }
            }
        }
        if (interfaceC25123OooOOO0 != null) {
            return interfaceC25123OooOOO0;
        }
        if (this.f85401OooOO0.isEmpty() && this.f85409OooOOo0) {
            throw new IllegalArgumentException(o0Oo0oo.OooO0OO("Missing transformation for ", cls, ". If you wish to ignore unknown resource types, use the optional transformation methods."));
        }
        return C25240OooO0OO.f85962OooO0O0;
    }
}
