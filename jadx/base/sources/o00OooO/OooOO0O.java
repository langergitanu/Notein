package o00OooO;

import android.util.Log;
import com.bumptech.glide.OooO;
import com.bumptech.glide.load.data.InterfaceC22256OooO0o0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import o00Ooo0o.C25111OooO;
import o00Ooo0o.EnumC25112OooO00o;
import o00Ooo0o.EnumC25114OooO0OO;
import o00Ooo0o.InterfaceC25116OooO0o;
import o00Ooo0o.InterfaceC25121OooOO0O;
import o00Ooo0o.InterfaceC25122OooOO0o;
import o00Ooo0o.InterfaceC25123OooOOO0;
import o00OooO.OooOO0;
import o00OoooO.InterfaceC25186OooOOo;
import o00o00O0.InterfaceC25253OooO0o0;
import o00o0O0O.C25321OooO00o;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOO0O<DataType, ResourceType, Transcode> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Class<DataType> f85483OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<? extends InterfaceC25121OooOO0O<DataType, ResourceType>> f85484OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC25253OooO0o0<ResourceType, Transcode> f85485OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C25321OooO00o.OooO0OO f85486OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f85487OooO0o0;

    public OooOO0O(Class cls, Class cls2, Class cls3, List list, InterfaceC25253OooO0o0 interfaceC25253OooO0o0, C25321OooO00o.OooO0OO oooO0OO) {
        this.f85483OooO00o = cls;
        this.f85484OooO0O0 = list;
        this.f85485OooO0OO = interfaceC25253OooO0o0;
        this.f85486OooO0Oo = oooO0OO;
        this.f85487OooO0o0 = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
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
    public final InterfaceC25145OooOo0o OooO00o(int i, int i2, InterfaceC22256OooO0o0 interfaceC22256OooO0o0, C25111OooO c25111OooO, OooOO0.OooO00o oooO00o) throws C25140OooOOo {
        InterfaceC25145OooOo0o interfaceC25145OooOo0oOooO0O0;
        InterfaceC25123OooOOO0 interfaceC25123OooOOO0;
        EnumC25114OooO0OO enumC25114OooO0OOOooO0O0;
        boolean z;
        boolean z2;
        InterfaceC25116OooO0o oooO0o;
        C25321OooO00o.OooO0OO oooO0OO = this.f85486OooO0Oo;
        List<Throwable> list = (List) oooO0OO.acquire();
        try {
            InterfaceC25145OooOo0o<ResourceType> interfaceC25145OooOo0oOooO0O02 = OooO0O0(interfaceC22256OooO0o0, i, i2, c25111OooO, list);
            oooO0OO.release(list);
            OooOO0 oooOO02 = OooOO0.this;
            oooOO02.getClass();
            Class<?> cls = interfaceC25145OooOo0oOooO0O02.get().getClass();
            EnumC25112OooO00o enumC25112OooO00o = EnumC25112OooO00o.f85371OooOoO;
            EnumC25112OooO00o enumC25112OooO00o2 = oooO00o.f85464OooO00o;
            OooO<R> oooO = oooOO02.f85434OooOo0o;
            InterfaceC25122OooOO0o interfaceC25122OooOO0oOooO00o = null;
            if (enumC25112OooO00o2 != enumC25112OooO00o) {
                InterfaceC25123OooOOO0 interfaceC25123OooOOO0OooO0o0 = oooO.OooO0o0((Class<Z>) cls);
                interfaceC25123OooOOO0 = interfaceC25123OooOOO0OooO0o0;
                interfaceC25145OooOo0oOooO0O0 = interfaceC25123OooOOO0OooO0o0.OooO0O0(oooOO02.f85440OooOooO, interfaceC25145OooOo0oOooO0O02, oooOO02.f85446Oooo00o, oooOO02.f85443Oooo0);
            } else {
                interfaceC25145OooOo0oOooO0O0 = interfaceC25145OooOo0oOooO0O02;
                interfaceC25123OooOOO0 = null;
            }
            if (!interfaceC25145OooOo0oOooO0O02.equals(interfaceC25145OooOo0oOooO0O0)) {
                interfaceC25145OooOo0oOooO0O02.recycle();
            }
            if (oooO.f85395OooO0OO.OooO00o().f67105OooO0Oo.OooO00o(interfaceC25145OooOo0oOooO0O0.OooO00o()) != null) {
                com.bumptech.glide.OooO oooOOooO00o = oooO.f85395OooO0OO.OooO00o();
                oooOOooO00o.getClass();
                interfaceC25122OooOO0oOooO00o = oooOOooO00o.f67105OooO0Oo.OooO00o(interfaceC25145OooOo0oOooO0O0.OooO00o());
                if (interfaceC25122OooOO0oOooO00o == null) {
                    throw new OooO.C22247OooO0Oo(interfaceC25145OooOo0oOooO0O0.OooO00o());
                }
                enumC25114OooO0OOOooO0O0 = interfaceC25122OooOO0oOooO00o.OooO0O0(oooOO02.f85448Oooo0OO);
            } else {
                enumC25114OooO0OOOooO0O0 = EnumC25114OooO0OO.f85382OooOoO0;
            }
            InterfaceC25122OooOO0o interfaceC25122OooOO0o = interfaceC25122OooOO0oOooO00o;
            InterfaceC25116OooO0o interfaceC25116OooO0o = oooOO02.f85456OoooO0O;
            ArrayList arrayListOooO0O0 = oooO.OooO0O0();
            int size = arrayListOooO0O0.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    z = false;
                    break;
                }
                if (((InterfaceC25186OooOOo.OooO00o) arrayListOooO0O0.get(i3)).f85729OooO00o.equals(interfaceC25116OooO0o)) {
                    z = true;
                    break;
                }
                i3++;
            }
            Object obj = interfaceC25145OooOo0oOooO0O0;
            if (oooOO02.f85447Oooo0O0.OooO0Oo(!z, enumC25112OooO00o2, enumC25114OooO0OOOooO0O0)) {
                if (interfaceC25122OooOO0o == null) {
                    throw new OooO.C22247OooO0Oo(interfaceC25145OooOo0oOooO0O0.get().getClass());
                }
                int iOrdinal = enumC25114OooO0OOOooO0O0.ordinal();
                if (iOrdinal == 0) {
                    z2 = true;
                    oooO0o = new OooO0o(oooOO02.f85456OoooO0O, oooOO02.f85441OooOooo);
                } else {
                    if (iOrdinal != 1) {
                        throw new IllegalArgumentException("Unknown strategy: " + enumC25114OooO0OOOooO0O0);
                    }
                    z2 = true;
                    oooO0o = new C25147OooOoO0(oooO.f85395OooO0OO.f67122OooO00o, oooOO02.f85456OoooO0O, oooOO02.f85441OooOooo, oooOO02.f85446Oooo00o, oooOO02.f85443Oooo0, interfaceC25123OooOOO0, cls, oooOO02.f85448Oooo0OO);
                }
                C25144OooOo0O<Z> c25144OooOo0O = (C25144OooOo0O) C25144OooOo0O.f85584OooOoOO.acquire();
                c25144OooOo0O.f85587OooOoO = false;
                c25144OooOo0O.f85588OooOoO0 = z2;
                c25144OooOo0O.f85585OooOo = interfaceC25145OooOo0oOooO0O0;
                OooOO0.OooO0O0<?> oooO0O0 = oooOO02.f85439OooOoo0;
                oooO0O0.f85466OooO00o = oooO0o;
                oooO0O0.f85467OooO0O0 = interfaceC25122OooOO0o;
                oooO0O0.f85468OooO0OO = c25144OooOo0O;
                obj = c25144OooOo0O;
            }
            return this.f85485OooO0OO.OooO00o(obj, c25111OooO);
        } catch (Throwable th) {
            oooO0OO.release(list);
            throw th;
        }
    }

    public final InterfaceC25145OooOo0o<ResourceType> OooO0O0(InterfaceC22256OooO0o0<DataType> interfaceC22256OooO0o0, int i, int i2, C25111OooO c25111OooO, List<Throwable> list) throws C25140OooOOo {
        List<? extends InterfaceC25121OooOO0O<DataType, ResourceType>> list2 = this.f85484OooO0O0;
        int size = list2.size();
        InterfaceC25145OooOo0o<ResourceType> interfaceC25145OooOo0oOooO00o = null;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC25121OooOO0O<DataType, ResourceType> interfaceC25121OooOO0O = list2.get(i3);
            try {
                if (interfaceC25121OooOO0O.OooO0O0(interfaceC22256OooO0o0.OooO00o(), c25111OooO)) {
                    interfaceC25145OooOo0oOooO00o = interfaceC25121OooOO0O.OooO00o(interfaceC22256OooO0o0.OooO00o(), i, i2, c25111OooO);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + interfaceC25121OooOO0O, e);
                }
                list.add(e);
            }
            if (interfaceC25145OooOo0oOooO00o != null) {
                break;
            }
        }
        if (interfaceC25145OooOo0oOooO00o != null) {
            return interfaceC25145OooOo0oOooO00o;
        }
        throw new C25140OooOOo(this.f85487OooO0o0, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f85483OooO00o + ", decoders=" + this.f85484OooO0O0 + ", transcoder=" + this.f85485OooO0OO + '}';
    }
}
