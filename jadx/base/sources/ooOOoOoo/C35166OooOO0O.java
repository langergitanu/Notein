package ooOOoOoo;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0OO.InterfaceC32609OooOo0;
import oO0OooO0.C33479OooO0o;
import oO0o0O0o.C33588OooOO0;

/* JADX INFO: renamed from: ooOOoOoo.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35166OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C33479OooO0o f126237OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C33588OooOO0 f126238OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Collection<C33479OooO0o> f126239OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final InterfaceC32507OooOO0o<InterfaceC32609OooOo0, String> f126240OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final InterfaceC35161OooO0o[] f126241OooO0o0;

    public C35166OooOO0O() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C35166OooOO0O(C33479OooO0o c33479OooO0o, C33588OooOO0 c33588OooOO0, Collection<C33479OooO0o> collection, InterfaceC32507OooOO0o<? super InterfaceC32609OooOo0, String> interfaceC32507OooOO0o, InterfaceC35161OooO0o... interfaceC35161OooO0oArr) {
        this.f126237OooO00o = c33479OooO0o;
        this.f126238OooO0O0 = c33588OooOO0;
        this.f126239OooO0OO = collection;
        this.f126240OooO0Oo = interfaceC32507OooOO0o;
        this.f126241OooO0o0 = interfaceC35161OooO0oArr;
    }

    public /* synthetic */ C35166OooOO0O(C33479OooO0o c33479OooO0o, InterfaceC35161OooO0o[] interfaceC35161OooO0oArr) {
        this(c33479OooO0o, interfaceC35161OooO0oArr, C35164OooO0oo.f126235OooOo0o);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C35166OooOO0O(C33479OooO0o name, InterfaceC35161OooO0o[] interfaceC35161OooO0oArr, InterfaceC32507OooOO0o<? super InterfaceC32609OooOo0, String> additionalChecks) {
        this(name, null, null, additionalChecks, (InterfaceC35161OooO0o[]) Arrays.copyOf(interfaceC35161OooO0oArr, interfaceC35161OooO0oArr.length));
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        kotlin.jvm.internal.OooOOO0.OooO0oO(additionalChecks, "additionalChecks");
    }

    public /* synthetic */ C35166OooOO0O(Set set, InterfaceC35161OooO0o[] interfaceC35161OooO0oArr) {
        this(set, interfaceC35161OooO0oArr, C35165OooOO0.f126236OooOo0o);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C35166OooOO0O(Collection<C33479OooO0o> nameList, InterfaceC35161OooO0o[] interfaceC35161OooO0oArr, InterfaceC32507OooOO0o<? super InterfaceC32609OooOo0, String> additionalChecks) {
        this(null, null, nameList, additionalChecks, (InterfaceC35161OooO0o[]) Arrays.copyOf(interfaceC35161OooO0oArr, interfaceC35161OooO0oArr.length));
        kotlin.jvm.internal.OooOOO0.OooO0oO(nameList, "nameList");
        kotlin.jvm.internal.OooOOO0.OooO0oO(additionalChecks, "additionalChecks");
    }
}
