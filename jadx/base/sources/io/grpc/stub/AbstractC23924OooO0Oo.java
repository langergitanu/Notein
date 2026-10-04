package io.grpc.stub;

import com.google.common.base.Preconditions;
import io.grpc.stub.AbstractC23924OooO0Oo;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import oO0OOo0o.AbstractC33059OooO0O0;
import oO0OOo0o.AbstractC33060OooO0Oo;
import oO0OOo0o.C33063OooO0oo;
import oO0OOo0o.C33068OooOOo;
import oO0OOo0o.InterfaceC33062OooO0oO;
import oO0OOo0o.OooO0OO;

/* JADX INFO: renamed from: io.grpc.stub.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC23924OooO0Oo<S extends AbstractC23924OooO0Oo<S>> {
    private final oO0OOo0o.OooO0OO callOptions;
    private final AbstractC33060OooO0Oo channel;

    /* JADX INFO: renamed from: io.grpc.stub.OooO0Oo$OooO00o */
    public interface OooO00o<T extends AbstractC23924OooO0Oo<T>> {
        T newStub(AbstractC33060OooO0Oo abstractC33060OooO0Oo, oO0OOo0o.OooO0OO oooO0OO);
    }

    public AbstractC23924OooO0Oo(AbstractC33060OooO0Oo abstractC33060OooO0Oo) {
        this(abstractC33060OooO0Oo, oO0OOo0o.OooO0OO.f119523OooOO0);
    }

    public static <T extends AbstractC23924OooO0Oo<T>> T newStub(OooO00o<T> oooO00o, AbstractC33060OooO0Oo abstractC33060OooO0Oo) {
        return (T) newStub(oooO00o, abstractC33060OooO0Oo, oO0OOo0o.OooO0OO.f119523OooOO0);
    }

    public abstract S build(AbstractC33060OooO0Oo abstractC33060OooO0Oo, oO0OOo0o.OooO0OO oooO0OO);

    public final oO0OOo0o.OooO0OO getCallOptions() {
        return this.callOptions;
    }

    public final AbstractC33060OooO0Oo getChannel() {
        return this.channel;
    }

    public final S withCallCredentials(AbstractC33059OooO0O0 abstractC33059OooO0O0) {
        AbstractC33060OooO0Oo abstractC33060OooO0Oo = this.channel;
        oO0OOo0o.OooO0OO oooO0OO = this.callOptions;
        oooO0OO.getClass();
        OooO0OO.OooO00o oooO00oOooO0O0 = oO0OOo0o.OooO0OO.OooO0O0(oooO0OO);
        oooO00oOooO0O0.f119536OooO0OO = abstractC33059OooO0O0;
        return (S) build(abstractC33060OooO0Oo, new oO0OOo0o.OooO0OO(oooO00oOooO0O0));
    }

    @Deprecated
    public final S withChannel(AbstractC33060OooO0Oo abstractC33060OooO0Oo) {
        return (S) build(abstractC33060OooO0Oo, this.callOptions);
    }

    public final S withCompression(String str) {
        AbstractC33060OooO0Oo abstractC33060OooO0Oo = this.channel;
        oO0OOo0o.OooO0OO oooO0OO = this.callOptions;
        oooO0OO.getClass();
        OooO0OO.OooO00o oooO00oOooO0O0 = oO0OOo0o.OooO0OO.OooO0O0(oooO0OO);
        oooO00oOooO0O0.f119537OooO0Oo = str;
        return (S) build(abstractC33060OooO0Oo, new oO0OOo0o.OooO0OO(oooO00oOooO0O0));
    }

    public final S withDeadline(C33068OooOOo c33068OooOOo) {
        AbstractC33060OooO0Oo abstractC33060OooO0Oo = this.channel;
        oO0OOo0o.OooO0OO oooO0OO = this.callOptions;
        oooO0OO.getClass();
        OooO0OO.OooO00o oooO00oOooO0O0 = oO0OOo0o.OooO0OO.OooO0O0(oooO0OO);
        oooO00oOooO0O0.f119534OooO00o = c33068OooOOo;
        return (S) build(abstractC33060OooO0Oo, new oO0OOo0o.OooO0OO(oooO00oOooO0O0));
    }

    public final S withDeadlineAfter(long j, TimeUnit timeUnit) {
        AbstractC33060OooO0Oo abstractC33060OooO0Oo = this.channel;
        oO0OOo0o.OooO0OO oooO0OO = this.callOptions;
        oooO0OO.getClass();
        if (timeUnit == null) {
            C33068OooOOo.OooO00o oooO00o = C33068OooOOo.f119573OooOoO;
            throw new NullPointerException("units");
        }
        C33068OooOOo c33068OooOOo = new C33068OooOOo(timeUnit.toNanos(j));
        OooO0OO.OooO00o oooO00oOooO0O0 = oO0OOo0o.OooO0OO.OooO0O0(oooO0OO);
        oooO00oOooO0O0.f119534OooO00o = c33068OooOOo;
        return (S) build(abstractC33060OooO0Oo, new oO0OOo0o.OooO0OO(oooO00oOooO0O0));
    }

    public final S withExecutor(Executor executor) {
        AbstractC33060OooO0Oo abstractC33060OooO0Oo = this.channel;
        oO0OOo0o.OooO0OO oooO0OO = this.callOptions;
        oooO0OO.getClass();
        OooO0OO.OooO00o oooO00oOooO0O0 = oO0OOo0o.OooO0OO.OooO0O0(oooO0OO);
        oooO00oOooO0O0.f119535OooO0O0 = executor;
        return (S) build(abstractC33060OooO0Oo, new oO0OOo0o.OooO0OO(oooO00oOooO0O0));
    }

    public final S withInterceptors(InterfaceC33062OooO0oO... interfaceC33062OooO0oOArr) {
        AbstractC33060OooO0Oo oooO0O0 = this.channel;
        int i = C33063OooO0oo.f119548OooO00o;
        List listAsList = Arrays.asList(interfaceC33062OooO0oOArr);
        Preconditions.checkNotNull(oooO0O0, "channel");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            oooO0O0 = new C33063OooO0oo.OooO0O0(oooO0O0, (InterfaceC33062OooO0oO) it.next());
        }
        return (S) build(oooO0O0, this.callOptions);
    }

    public final S withMaxInboundMessageSize(int i) {
        return (S) build(this.channel, this.callOptions.OooO0OO(i));
    }

    public final S withMaxOutboundMessageSize(int i) {
        return (S) build(this.channel, this.callOptions.OooO0Oo(i));
    }

    public final <T> S withOption(OooO0OO.OooO0O0<T> oooO0O0, T t) {
        return (S) build(this.channel, this.callOptions.OooO0o0(oooO0O0, t));
    }

    public final S withWaitForReady() {
        AbstractC33060OooO0Oo abstractC33060OooO0Oo = this.channel;
        oO0OOo0o.OooO0OO oooO0OO = this.callOptions;
        oooO0OO.getClass();
        OooO0OO.OooO00o oooO00oOooO0O0 = oO0OOo0o.OooO0OO.OooO0O0(oooO0OO);
        oooO00oOooO0O0.f119540OooO0oO = Boolean.TRUE;
        return (S) build(abstractC33060OooO0Oo, new oO0OOo0o.OooO0OO(oooO00oOooO0O0));
    }

    public AbstractC23924OooO0Oo(AbstractC33060OooO0Oo abstractC33060OooO0Oo, oO0OOo0o.OooO0OO oooO0OO) {
        this.channel = (AbstractC33060OooO0Oo) Preconditions.checkNotNull(abstractC33060OooO0Oo, "channel");
        this.callOptions = (oO0OOo0o.OooO0OO) Preconditions.checkNotNull(oooO0OO, "callOptions");
    }

    public static <T extends AbstractC23924OooO0Oo<T>> T newStub(OooO00o<T> oooO00o, AbstractC33060OooO0Oo abstractC33060OooO0Oo, oO0OOo0o.OooO0OO oooO0OO) {
        return (T) oooO00o.newStub(abstractC33060OooO0Oo, oooO0OO);
    }
}
