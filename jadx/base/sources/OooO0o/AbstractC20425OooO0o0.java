package OooO0o;

import OooO0o.AbstractC20425OooO0o0;
import OooO0oO.AbstractC20431OooO00o;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.core.os.BundleCompat;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.InterfaceC21986OooOoOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.OooOOO0;
import oO0o0O0O.C33562OooO00o;
import oO0o0O0O.C33574OooOOO0;

/* JADX INFO: renamed from: OooO0o.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC20425OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final LinkedHashMap f58250OooO00o = new LinkedHashMap();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final LinkedHashMap f58251OooO0O0 = new LinkedHashMap();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final LinkedHashMap f58252OooO0OO = new LinkedHashMap();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayList f58253OooO0Oo = new ArrayList();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final transient LinkedHashMap f58255OooO0o0 = new LinkedHashMap();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final LinkedHashMap f58254OooO0o = new LinkedHashMap();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Bundle f58256OooO0oO = new Bundle();

    /* JADX INFO: renamed from: OooO0o.OooO0o0$OooO00o */
    public static final class OooO00o<O> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO0o.OooO00o<O> f58257OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final AbstractC20431OooO00o<?, O> f58258OooO0O0;

        public OooO00o(AbstractC20431OooO00o contract, OooO0o.OooO00o callback) {
            OooOOO0.OooO0oO(callback, "callback");
            OooOOO0.OooO0oO(contract, "contract");
            this.f58257OooO00o = callback;
            this.f58258OooO0O0 = contract;
        }
    }

    /* JADX INFO: renamed from: OooO0o.OooO0o0$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AbstractC21979OooOOo0 f58259OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ArrayList f58260OooO0O0 = new ArrayList();

        public OooO0O0(AbstractC21979OooOOo0 abstractC21979OooOOo0) {
            this.f58259OooO00o = abstractC21979OooOOo0;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r5v3 boolean
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    public final boolean OooO00o(int r4, int r5, android.content.Intent r6) {
        /*
            r3 = this;
            java.util.LinkedHashMap r0 = r3.f58250OooO00o
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r0.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L10
            r4 = 0
            return r4
        L10:
            java.util.LinkedHashMap r0 = r3.f58255OooO0o0
            java.lang.Object r0 = r0.get(r4)
            OooO0o.OooO0o0$OooO00o r0 = (OooO0o.AbstractC20425OooO0o0.OooO00o) r0
            if (r0 == 0) goto L1d
            OooO0o.OooO00o<O> r1 = r0.f58257OooO00o
            goto L1e
        L1d:
            r1 = 0
        L1e:
            if (r1 == 0) goto L37
            java.util.ArrayList r1 = r3.f58253OooO0Oo
            boolean r2 = r1.contains(r4)
            if (r2 == 0) goto L37
            OooO0o.OooO00o<O> r2 = r0.f58257OooO00o
            OooO0oO.OooO00o<?, O> r0 = r0.f58258OooO0O0
            java.lang.Object r5 = r0.OooO0OO(r5, r6)
            r2.OooO0O0(r5)
            r1.remove(r4)
            goto L46
        L37:
            java.util.LinkedHashMap r0 = r3.f58254OooO0o
            r0.remove(r4)
            androidx.activity.result.ActivityResult r0 = new androidx.activity.result.ActivityResult
            r0.<init>(r5, r6)
            android.os.Bundle r5 = r3.f58256OooO0oO
            r5.putParcelable(r4, r0)
        L46:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: OooO0o.AbstractC20425OooO0o0.OooO00o(int, int, android.content.Intent):boolean");
    }

    public abstract void OooO0O0(int i, AbstractC20431OooO00o abstractC20431OooO00o, Object obj);

    public final C20426OooO0oO OooO0OO(final String key, InterfaceC21987OooOoo interfaceC21987OooOoo, final AbstractC20431OooO00o contract, final OooO0o.OooO00o callback) {
        OooOOO0.OooO0oO(key, "key");
        OooOOO0.OooO0oO(contract, "contract");
        OooOOO0.OooO0oO(callback, "callback");
        AbstractC21979OooOOo0 lifecycle = interfaceC21987OooOoo.getLifecycle();
        if (lifecycle.OooO0O0().compareTo(AbstractC21979OooOOo0.OooO0O0.f65539OooOoO) >= 0) {
            throw new IllegalStateException(("LifecycleOwner " + interfaceC21987OooOoo + " is attempting to register while current state is " + lifecycle.OooO0O0() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        OooO0o0(key);
        LinkedHashMap linkedHashMap = this.f58252OooO0OO;
        OooO0O0 oooO0O0 = (OooO0O0) linkedHashMap.get(key);
        if (oooO0O0 == null) {
            oooO0O0 = new OooO0O0(lifecycle);
        }
        InterfaceC21986OooOoOO interfaceC21986OooOoOO = new InterfaceC21986OooOoOO() { // from class: OooO0o.OooO0OO
            @Override // androidx.lifecycle.InterfaceC21986OooOoOO
            public final void OooOOo0(InterfaceC21987OooOoo interfaceC21987OooOoo2, AbstractC21979OooOOo0.OooO00o oooO00o) {
                AbstractC21979OooOOo0.OooO00o oooO00o2 = AbstractC21979OooOOo0.OooO00o.ON_START;
                AbstractC20425OooO0o0 abstractC20425OooO0o0 = this.f58246OooOo0o;
                String str = key;
                if (oooO00o2 != oooO00o) {
                    if (AbstractC21979OooOOo0.OooO00o.ON_STOP == oooO00o) {
                        abstractC20425OooO0o0.f58255OooO0o0.remove(str);
                        return;
                    } else {
                        if (AbstractC21979OooOOo0.OooO00o.ON_DESTROY == oooO00o) {
                            abstractC20425OooO0o0.OooO0o(str);
                            return;
                        }
                        return;
                    }
                }
                LinkedHashMap linkedHashMap2 = abstractC20425OooO0o0.f58255OooO0o0;
                OooO00o oooO00o3 = callback;
                AbstractC20431OooO00o abstractC20431OooO00o = contract;
                linkedHashMap2.put(str, new AbstractC20425OooO0o0.OooO00o(abstractC20431OooO00o, oooO00o3));
                LinkedHashMap linkedHashMap3 = abstractC20425OooO0o0.f58254OooO0o;
                if (linkedHashMap3.containsKey(str)) {
                    Object obj = linkedHashMap3.get(str);
                    linkedHashMap3.remove(str);
                    oooO00o3.OooO0O0(obj);
                }
                Bundle bundle = abstractC20425OooO0o0.f58256OooO0oO;
                ActivityResult activityResult = (ActivityResult) BundleCompat.getParcelable(bundle, str, ActivityResult.class);
                if (activityResult != null) {
                    bundle.remove(str);
                    oooO00o3.OooO0O0(abstractC20431OooO00o.OooO0OO(activityResult.f62240OooOo0o, activityResult.f62239OooOo));
                }
            }
        };
        oooO0O0.f58259OooO00o.OooO00o(interfaceC21986OooOoOO);
        oooO0O0.f58260OooO0O0.add(interfaceC21986OooOoOO);
        linkedHashMap.put(key, oooO0O0);
        return new C20426OooO0oO(this, key, contract);
    }

    public final C20427OooO0oo OooO0Oo(String key, AbstractC20431OooO00o abstractC20431OooO00o, OooO0o.OooO00o oooO00o) {
        OooOOO0.OooO0oO(key, "key");
        OooO0o0(key);
        this.f58255OooO0o0.put(key, new OooO00o(abstractC20431OooO00o, oooO00o));
        LinkedHashMap linkedHashMap = this.f58254OooO0o;
        if (linkedHashMap.containsKey(key)) {
            Object obj = linkedHashMap.get(key);
            linkedHashMap.remove(key);
            oooO00o.OooO0O0(obj);
        }
        Bundle bundle = this.f58256OooO0oO;
        ActivityResult activityResult = (ActivityResult) BundleCompat.getParcelable(bundle, key, ActivityResult.class);
        if (activityResult != null) {
            bundle.remove(key);
            oooO00o.OooO0O0(abstractC20431OooO00o.OooO0OO(activityResult.f62240OooOo0o, activityResult.f62239OooOo));
        }
        return new C20427OooO0oo(this, key, abstractC20431OooO00o);
    }

    public final void OooO0o(String key) {
        Integer num;
        OooOOO0.OooO0oO(key, "key");
        if (!this.f58253OooO0Oo.contains(key) && (num = (Integer) this.f58251OooO0O0.remove(key)) != null) {
            this.f58250OooO00o.remove(num);
        }
        this.f58255OooO0o0.remove(key);
        LinkedHashMap linkedHashMap = this.f58254OooO0o;
        if (linkedHashMap.containsKey(key)) {
            StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("Dropping pending result for request ", key, ": ");
            sbOooO0o0.append(linkedHashMap.get(key));
            Log.w("ActivityResultRegistry", sbOooO0o0.toString());
            linkedHashMap.remove(key);
        }
        Bundle bundle = this.f58256OooO0oO;
        if (bundle.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + ((ActivityResult) BundleCompat.getParcelable(bundle, key, ActivityResult.class)));
            bundle.remove(key);
        }
        LinkedHashMap linkedHashMap2 = this.f58252OooO0OO;
        OooO0O0 oooO0O0 = (OooO0O0) linkedHashMap2.get(key);
        if (oooO0O0 != null) {
            ArrayList arrayList = oooO0O0.f58260OooO0O0;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                oooO0O0.f58259OooO00o.OooO0OO((InterfaceC21986OooOoOO) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(key);
        }
    }

    public final void OooO0o0(String str) {
        LinkedHashMap linkedHashMap = this.f58251OooO0O0;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        for (Number number : (C33562OooO00o) C33574OooOOO0.OooOO0(OooO0o.f58249OooOo0o)) {
            int iIntValue = number.intValue();
            LinkedHashMap linkedHashMap2 = this.f58250OooO00o;
            if (!linkedHashMap2.containsKey(Integer.valueOf(iIntValue))) {
                int iIntValue2 = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue2), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue2));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }
}
