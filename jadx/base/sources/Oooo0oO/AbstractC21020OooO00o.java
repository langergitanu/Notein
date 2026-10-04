package Oooo0oO;

import OooOoOO.C20519OooO0Oo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import o000oo0.AbstractC24673OooOo0O;
import o000oooO.InterfaceC24759OooO0o;
import oO00ooO.C32447OooOOo;

/* JADX INFO: renamed from: Oooo0oO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21020OooO00o implements InterfaceC21026OooO0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f60878OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Object f60879OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Serializable f60880OooO0OO;

    public AbstractC21020OooO00o(AbstractC24673OooOo0O database) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(database, "database");
        this.f60878OooO00o = database;
        this.f60879OooO0O0 = new AtomicBoolean(false);
        this.f60880OooO0OO = C20519OooO0Oo.OooO0OO(new o000oo0.Oooo000(this, 0));
    }

    public void OooO() {
        ((ArrayList) this.f60880OooO0OO).clear();
        this.f60879OooO0O0 = this.f60878OooO00o;
        OooOO0O();
    }

    @Override // Oooo0oO.InterfaceC21026OooO0oO
    public Object OooO0o0() {
        return this.f60879OooO0O0;
    }

    @Override // Oooo0oO.InterfaceC21026OooO0oO
    public void OooO0oO(Object obj) {
        ((ArrayList) this.f60880OooO0OO).add(this.f60879OooO0O0);
        this.f60879OooO0O0 = obj;
    }

    public InterfaceC24759OooO0o OooO0oo() {
        AbstractC24673OooOo0O abstractC24673OooOo0O = (AbstractC24673OooOo0O) this.f60878OooO00o;
        abstractC24673OooOo0O.OooO00o();
        if (((AtomicBoolean) this.f60879OooO0O0).compareAndSet(false, true)) {
            return (InterfaceC24759OooO0o) ((C32447OooOOo) this.f60880OooO0OO).getValue();
        }
        String strOooOO0 = OooOO0();
        abstractC24673OooOo0O.getClass();
        abstractC24673OooOo0O.OooO00o();
        abstractC24673OooOo0O.OooO0O0();
        return abstractC24673OooOo0O.OooOO0O().OooooOO().o0000Oo(strOooOO0);
    }

    public abstract String OooOO0();

    public abstract void OooOO0O();

    public void OooOO0o(InterfaceC24759OooO0o statement) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(statement, "statement");
        if (statement == ((InterfaceC24759OooO0o) ((C32447OooOOo) this.f60880OooO0OO).getValue())) {
            ((AtomicBoolean) this.f60879OooO0O0).set(false);
        }
    }

    @Override // Oooo0oO.InterfaceC21026OooO0oO
    /* JADX INFO: renamed from: up */
    public void mo0up() {
        ArrayList arrayList = (ArrayList) this.f60880OooO0OO;
        if (arrayList.isEmpty()) {
            o000000O.OooO0OO("empty stack");
            throw null;
        }
        this.f60879OooO0O0 = arrayList.remove(arrayList.size() - 1);
    }

    public AbstractC21020OooO00o(Object obj) {
        this.f60878OooO00o = obj;
        this.f60880OooO0OO = new ArrayList();
        this.f60879OooO0O0 = obj;
    }
}
