package o0Ooo000;

import android.view.View;
import oO00ooO.C32460OooOooO;
import oO0o0OO.C33614OooOOO0;
import oO0o0o0O.C33869OooOOO;

/* JADX INFO: renamed from: o0Ooo000.Oooo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class RunnableC29359Oooo0 implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f104120OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f104121OooOo0o = 0;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f104122OooOoO0;

    public /* synthetic */ RunnableC29359Oooo0(C29363Oooo0O0 c29363Oooo0O0, View view, int i) {
        this.f104120OooOo = c29363Oooo0O0;
        this.f104122OooOoO0 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f104121OooOo0o) {
            case 0:
                C29363Oooo0O0 c29363Oooo0O0 = (C29363Oooo0O0) this.f104120OooOo;
                c29363Oooo0O0.getClass();
                c29363Oooo0O0.f104128OooO0o = null;
                break;
            default:
                ((C33614OooOOO0) this.f104120OooOo).OooOooO((C33869OooOOO) this.f104122OooOoO0, C32460OooOooO.f116667OooO00o);
                break;
        }
    }

    public /* synthetic */ RunnableC29359Oooo0(C33614OooOOO0 c33614OooOOO0, C33869OooOOO c33869OooOOO) {
        this.f104120OooOo = c33614OooOOO0;
        this.f104122OooOoO0 = c33869OooOOO;
    }
}
