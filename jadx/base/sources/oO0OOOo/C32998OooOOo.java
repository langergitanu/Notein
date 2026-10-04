package oO0OOOo;

import OooO0O0.C20395OooO0o0;
import OooO0O0.C20396OooO0oO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0O0.C33558OooO0Oo;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: oO0OOOo.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32998OooOOo {

    /* JADX INFO: Add missing generic type declarations: [H] */
    /* JADX INFO: renamed from: oO0OOOo.OooOOo$OooO00o */
    public static final class OooO00o<H> extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<H, C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C33558OooO0Oo<H> f119384OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C33558OooO0Oo<H> c33558OooO0Oo) {
            super(1);
            this.f119384OooOo0o = c33558OooO0Oo;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(Object it) {
            kotlin.jvm.internal.OooOOO0.OooO0o(it, "it");
            this.f119384OooOo0o.add(it);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <H> Collection<H> OooO00o(Collection<? extends H> collection, InterfaceC32507OooOO0o<? super H, ? extends oO0O0OO.OooO00o> descriptorByHandle) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(collection, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptorByHandle, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        C33558OooO0Oo c33558OooO0Oo = new C33558OooO0Oo();
        while (!linkedList.isEmpty()) {
            Object objOooo0oO = OooOo.Oooo0oO(linkedList);
            C33558OooO0Oo c33558OooO0Oo2 = new C33558OooO0Oo();
            ArrayList<C20395OooO0o0> arrayListOooO0oO = C32995OooOOO0.OooO0oO(objOooo0oO, linkedList, descriptorByHandle, new OooO00o(c33558OooO0Oo2));
            if (arrayListOooO0oO.size() == 1 && c33558OooO0Oo2.isEmpty()) {
                Object objOooooo = OooOo.Oooooo(arrayListOooO0oO);
                kotlin.jvm.internal.OooOOO0.OooO0o(objOooooo, "overridableGroup.single()");
                c33558OooO0Oo.add(objOooooo);
            } else {
                C20396OooO0oO c20396OooO0oO = (Object) C32995OooOOO0.OooOOoo(arrayListOooO0oO, descriptorByHandle);
                oO0O0OO.OooO00o oooO00oInvoke = descriptorByHandle.invoke(c20396OooO0oO);
                for (C20395OooO0o0 it : arrayListOooO0oO) {
                    kotlin.jvm.internal.OooOOO0.OooO0o(it, "it");
                    if (!C32995OooOOO0.OooOO0O(oooO00oInvoke, descriptorByHandle.invoke(it))) {
                        c33558OooO0Oo2.add(it);
                    }
                }
                if (!c33558OooO0Oo2.isEmpty()) {
                    c33558OooO0Oo.addAll(c33558OooO0Oo2);
                }
                c33558OooO0Oo.add(c20396OooO0oO);
            }
        }
        return c33558OooO0Oo;
    }
}
