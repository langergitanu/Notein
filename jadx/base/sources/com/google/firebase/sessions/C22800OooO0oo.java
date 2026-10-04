package com.google.firebase.sessions;

import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO00.C34001o0ooOO0;
import oO0oO00.C34002o0ooOoO;
import oO0oO00.InterfaceC33966Oooo0OO;

/* JADX INFO: renamed from: com.google.firebase.sessions.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C22800OooO0oo implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f68693OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f68694OooOo0o;

    public /* synthetic */ C22800OooO0oo(Object obj, int i) {
        this.f68694OooOo0o = i;
        this.f68693OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        InterfaceC33911OooO0OO<?>[] interfaceC33911OooO0OOArrChildSerializers;
        switch (this.f68694OooOo0o) {
            case 0:
                return ProcessDataManagerImpl.myProcessName_delegate$lambda$0((ProcessDataManagerImpl) this.f68693OooOo);
            default:
                InterfaceC33966Oooo0OO<?> interfaceC33966Oooo0OO = ((C34001o0ooOO0) this.f68693OooOo).f122281OooO0O0;
                return (interfaceC33966Oooo0OO == null || (interfaceC33911OooO0OOArrChildSerializers = interfaceC33966Oooo0OO.childSerializers()) == null) ? C34002o0ooOoO.f122290OooO00o : interfaceC33911OooO0OOArrChildSerializers;
        }
    }
}
