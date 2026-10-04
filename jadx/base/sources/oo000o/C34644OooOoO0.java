package oo000o;

import java.util.Map;
import o0000Ooo.EnumC24238OooOOO;
import o00oO0O.AbstractC25516Oooo0OO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oo000o.AbstractC34655Oooo0o;

/* JADX INFO: renamed from: oo000o.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C34644OooOoO0 implements OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f124822OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f124823OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Map<AbstractC34622OooO00o, Integer> f124824OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f124825OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32507OooOO0o<AbstractC34655Oooo0o.OooO00o, C32460OooOooO> f124826OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ InterfaceC34643OooOoO f124827OooO0o0;

    /* JADX WARN: Multi-variable type inference failed */
    public C34644OooOoO0(int i, int i2, Map<AbstractC34622OooO00o, Integer> map, InterfaceC34643OooOoO interfaceC34643OooOoO, InterfaceC32507OooOO0o<? super AbstractC34655Oooo0o.OooO00o, C32460OooOooO> interfaceC32507OooOO0o) {
        this.f124825OooO0Oo = i;
        this.f124827OooO0o0 = interfaceC34643OooOoO;
        this.f124826OooO0o = interfaceC32507OooOO0o;
        this.f124822OooO00o = i;
        this.f124823OooO0O0 = i2;
        this.f124824OooO0OO = map;
    }

    @Override // oo000o.OooOo
    public final void OooO00o() {
        AbstractC34655Oooo0o.OooO00o.C20369OooO00o c20369OooO00o = AbstractC34655Oooo0o.OooO00o.f124848OooO00o;
        InterfaceC34643OooOoO interfaceC34643OooOoO = this.f124827OooO0o0;
        EnumC24238OooOOO layoutDirection = interfaceC34643OooOoO.getLayoutDirection();
        AbstractC25516Oooo0OO abstractC25516Oooo0OO = interfaceC34643OooOoO instanceof AbstractC25516Oooo0OO ? (AbstractC25516Oooo0OO) interfaceC34643OooOoO : null;
        InterfaceC34635OooOOOO interfaceC34635OooOOOO = AbstractC34655Oooo0o.OooO00o.f124851OooO0Oo;
        c20369OooO00o.getClass();
        int i = AbstractC34655Oooo0o.OooO00o.f124850OooO0OO;
        EnumC24238OooOOO enumC24238OooOOO = AbstractC34655Oooo0o.OooO00o.f124849OooO0O0;
        AbstractC34655Oooo0o.OooO00o.f124850OooO0OO = this.f124825OooO0Oo;
        AbstractC34655Oooo0o.OooO00o.f124849OooO0O0 = layoutDirection;
        boolean zOooO = AbstractC34655Oooo0o.OooO00o.C20369OooO00o.OooO(c20369OooO00o, abstractC25516Oooo0OO);
        this.f124826OooO0o.invoke(c20369OooO00o);
        if (abstractC25516Oooo0OO != null) {
            abstractC25516Oooo0OO.f87024OooOoo0 = zOooO;
        }
        AbstractC34655Oooo0o.OooO00o.f124850OooO0OO = i;
        AbstractC34655Oooo0o.OooO00o.f124849OooO0O0 = enumC24238OooOOO;
        AbstractC34655Oooo0o.OooO00o.f124851OooO0Oo = interfaceC34635OooOOOO;
    }

    @Override // oo000o.OooOo
    public final Map<AbstractC34622OooO00o, Integer> OooO0O0() {
        return this.f124824OooO0OO;
    }

    @Override // oo000o.OooOo
    public final int getHeight() {
        return this.f124823OooO0O0;
    }

    @Override // oo000o.OooOo
    public final int getWidth() {
        return this.f124822OooO00o;
    }
}
