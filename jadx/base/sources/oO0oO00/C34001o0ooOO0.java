package oO0oO00;

import OooOoOO.C20519OooO0Oo;
import com.google.firebase.sessions.C22800OooO0oo;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import o0O0oooo.C26373OooOOo0;
import oO00ooO.EnumC32441OooOO0O;
import oO0o.AbstractC33534OooOO0o;
import oO0o.InterfaceC33531OooO0o0;
import oO0o.OooOOO0;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34436OooOoOO;

/* JADX INFO: renamed from: oO0oO00.o0ooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C34001o0ooOO0 implements InterfaceC33531OooO0o0, InterfaceC33945OooOOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Object f122279OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f122280OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC33966Oooo0OO<?> f122281OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f122282OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f122283OooO0Oo = -1;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final List<Annotation>[] f122284OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String[] f122285OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean[] f122286OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public Object f122287OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Object f122288OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final Object f122289OooOO0O;

    public C34001o0ooOO0(String str, InterfaceC33966Oooo0OO<?> interfaceC33966Oooo0OO, int i) {
        this.f122280OooO00o = str;
        this.f122281OooO0O0 = interfaceC33966Oooo0OO;
        this.f122282OooO0OO = i;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.f122285OooO0o0 = strArr;
        int i3 = this.f122282OooO0OO;
        this.f122284OooO0o = new List[i3];
        this.f122286OooO0oO = new boolean[i3];
        this.f122287OooO0oo = C34436OooOoOO.f123455OooOo0o;
        EnumC32441OooOO0O enumC32441OooOO0O = EnumC32441OooOO0O.f116633OooOo;
        this.f122279OooO = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new C22800OooO0oo(this, 1));
        this.f122288OooOO0 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new com.google.firebase.sessions.OooO(this, 2));
        this.f122289OooOO0O = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new com.google.firebase.sessions.OooOO0(this, 1));
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final boolean OooO(int i) {
        return this.f122286OooO0oO[i];
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // oO0oO00.InterfaceC33945OooOOO0
    public final Set<String> OooO00o() {
        return this.f122287OooO0oo.keySet();
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final boolean OooO0O0() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // oO0o.InterfaceC33531OooO0o0
    public final int OooO0OO(String name) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        Integer num = (Integer) this.f122287OooO0oo.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
    @Override // oO0o.InterfaceC33531OooO0o0
    public InterfaceC33531OooO0o0 OooO0Oo(int i) {
        return ((InterfaceC33911OooO0OO[]) this.f122279OooO.getValue())[i].getDescriptor();
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final String OooO0o(int i) {
        return this.f122285OooO0o0[i];
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final int OooO0o0() {
        return this.f122282OooO0OO;
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final List<Annotation> OooO0oO(int i) {
        List<Annotation> list = this.f122284OooO0o[i];
        return list == null ? C34434OooOoO.f123453OooOo0o : list;
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final String OooO0oo() {
        return this.f122280OooO00o;
    }

    public final void OooOO0(String name, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        int i = this.f122283OooO0Oo + 1;
        this.f122283OooO0Oo = i;
        String[] strArr = this.f122285OooO0o0;
        strArr[i] = name;
        this.f122286OooO0oO[i] = z;
        this.f122284OooO0o[i] = null;
        if (i == this.f122282OooO0OO - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                map.put(strArr[i2], Integer.valueOf(i2));
            }
            this.f122287OooO0oo = map;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, oO00ooO.OooOO0] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, oO00ooO.OooOO0] */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C34001o0ooOO0) {
            InterfaceC33531OooO0o0 interfaceC33531OooO0o0 = (InterfaceC33531OooO0o0) obj;
            if (this.f122280OooO00o.equals(interfaceC33531OooO0o0.OooO0oo()) && Arrays.equals((InterfaceC33531OooO0o0[]) this.f122288OooOO0.getValue(), (InterfaceC33531OooO0o0[]) ((C34001o0ooOO0) obj).f122288OooOO0.getValue())) {
                int iOooO0o0 = interfaceC33531OooO0o0.OooO0o0();
                int i = this.f122282OooO0OO;
                if (i == iOooO0o0) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(OooO0Oo(i2).OooO0oo(), interfaceC33531OooO0o0.OooO0Oo(i2).OooO0oo()) && kotlin.jvm.internal.OooOOO0.OooO0O0(OooO0Oo(i2).getKind(), interfaceC33531OooO0o0.OooO0Oo(i2).getKind())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public final List<Annotation> getAnnotations() {
        return C34434OooOoO.f123453OooOo0o;
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public AbstractC33534OooOO0o getKind() {
        return OooOOO0.OooO00o.f121132OooO00o;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
    public int hashCode() {
        return ((Number) this.f122289OooOO0O.getValue()).intValue();
    }

    @Override // oO0o.InterfaceC33531OooO0o0
    public boolean isInline() {
        return false;
    }

    public String toString() {
        return oOo000Oo.OooOo.o000oOoO(oO0O00oo.OooOO0.OooO(0, this.f122282OooO0OO), ", ", this.f122280OooO00o.concat("("), ")", new C26373OooOOo0(this, 1), 24);
    }
}
