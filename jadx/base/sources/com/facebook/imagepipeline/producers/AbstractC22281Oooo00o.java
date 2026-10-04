package com.facebook.imagepipeline.producers;

import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import o00o0Ooo.C25425OooO0O0;
import o00o0o.AbstractC25434OooO00o;
import o00o0o.C25435OooO0O0;
import o00oo.C25638OooO0oO;
import o00ooO0.C25748OooOoO;
import o00ooO0.C25750OooOoOO;
import o00ooO0.C25752OooOoo0;
import o00ooO0o.C25763OooO00o;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC22281Oooo00o implements InterfaceC22291OoooO0O<C25638OooO0oO> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Executor f67392OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C25750OooOoOO f67393OooO0O0;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.Oooo00o$OooO00o */
    public class OooO00o extends AbstractRunnableC22299Ooooo0o<C25638OooO0oO> {

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public final /* synthetic */ o000oOoO f67394OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final /* synthetic */ C25763OooO00o f67395OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22288OoooO f67396OooOooO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(OooO oooO, o000oOoO o000oooo2, InterfaceC22288OoooO interfaceC22288OoooO, String str, C25763OooO00o c25763OooO00o, o000oOoO o000oooo3, InterfaceC22288OoooO interfaceC22288OoooO2) {
            super(oooO, o000oooo2, interfaceC22288OoooO, str);
            this.f67395OooOoo0 = c25763OooO00o;
            this.f67394OooOoo = o000oooo3;
            this.f67396OooOooO = interfaceC22288OoooO2;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractRunnableC22299Ooooo0o
        public final void OooO0O0(Object obj) {
            C25638OooO0oO.OooO0OO((C25638OooO0oO) obj);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractRunnableC22299Ooooo0o
        public final Object OooO0Oo() throws Exception {
            C25763OooO00o c25763OooO00o = this.f67395OooOoo0;
            AbstractC22281Oooo00o abstractC22281Oooo00o = AbstractC22281Oooo00o.this;
            C25638OooO0oO c25638OooO0oOOooO0OO = abstractC22281Oooo00o.OooO0OO(c25763OooO00o);
            o000oOoO o000oooo2 = this.f67394OooOoo;
            InterfaceC22288OoooO interfaceC22288OoooO = this.f67396OooOooO;
            if (c25638OooO0oOOooO0OO == null) {
                o000oooo2.OooO0O0(interfaceC22288OoooO, abstractC22281Oooo00o.OooO0Oo(), false);
                interfaceC22288OoooO.Oooo00o(ImagesContract.LOCAL, RemoteConfigComponent.FETCH_FILE_NAME);
                return null;
            }
            c25638OooO0oOOooO0OO.Oooo000();
            o000oooo2.OooO0O0(interfaceC22288OoooO, abstractC22281Oooo00o.OooO0Oo(), true);
            interfaceC22288OoooO.Oooo00o(ImagesContract.LOCAL, RemoteConfigComponent.FETCH_FILE_NAME);
            c25638OooO0oOOooO0OO.ooOO();
            interfaceC22288OoooO.Oooo000(c25638OooO0oOOooO0OO.f87509OooOooo, "image_color_space");
            return c25638OooO0oOOooO0OO;
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.Oooo00o$OooO0O0 */
    public class OooO0O0 extends C22260OooO0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ OooO00o f67398OooO00o;

        public OooO0O0(OooO00o oooO00o) {
            this.f67398OooO00o = oooO00o;
        }

        @Override // com.facebook.imagepipeline.producers.InterfaceC22292OoooOO0
        public final void OooO0O0() {
            this.f67398OooO00o.OooO00o();
        }
    }

    public AbstractC22281Oooo00o(Executor executor, C25750OooOoOO c25750OooOoOO) {
        this.f67392OooO00o = executor;
        this.f67393OooO0O0 = c25750OooOoOO;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC22291OoooO0O
    public final void OooO00o(OooO<C25638OooO0oO> oooO, InterfaceC22288OoooO interfaceC22288OoooO) {
        o000oOoO o000ooooOooOOo0 = interfaceC22288OoooO.OooOOo0();
        C25763OooO00o c25763OooO00oOooOOoo = interfaceC22288OoooO.OooOOoo();
        interfaceC22288OoooO.Oooo00o(ImagesContract.LOCAL, RemoteConfigComponent.FETCH_FILE_NAME);
        OooO00o oooO00o = new OooO00o(oooO, o000ooooOooOOo0, interfaceC22288OoooO, OooO0Oo(), c25763OooO00oOooOOoo, o000ooooOooOOo0, interfaceC22288OoooO);
        interfaceC22288OoooO.OooO0OO(new OooO0O0(oooO00o));
        this.f67392OooO00o.execute(oooO00o);
    }

    public final C25638OooO0oO OooO0O0(InputStream inputStream, int i) throws IOException {
        C25435OooO0O0 c25435OooO0O0O00Oo0;
        C25750OooOoOO c25750OooOoOO = this.f67393OooO0O0;
        try {
            if (i <= 0) {
                c25750OooOoOO.getClass();
                kotlin.jvm.internal.OooOOO0.OooO0oO(inputStream, "inputStream");
                o00ooO0.OooOo oooOo = c25750OooOoOO.f87875OooO00o;
                C25752OooOoo0 c25752OooOoo0 = new C25752OooOoo0(oooOo, oooOo.f87867OooOO0[0]);
                try {
                    c25750OooOoOO.f87876OooO0O0.OooO00o(inputStream, c25752OooOoo0);
                    C25748OooOoO c25748OooOoOOooO00o = c25752OooOoo0.OooO00o();
                    c25752OooOoo0.close();
                    c25435OooO0O0O00Oo0 = AbstractC25434OooO00o.o00Oo0(c25748OooOoOOooO00o);
                } catch (Throwable th) {
                    c25752OooOoo0.close();
                    throw th;
                }
            } else {
                c25435OooO0O0O00Oo0 = AbstractC25434OooO00o.o00Oo0(c25750OooOoOO.OooO00o(inputStream, i));
            }
            C25435OooO0O0 c25435OooO0O0 = c25435OooO0O0O00Oo0;
            C25638OooO0oO c25638OooO0oO = new C25638OooO0oO(c25435OooO0O0);
            C25425OooO0O0.OooO0O0(inputStream);
            c25435OooO0O0.close();
            return c25638OooO0oO;
        } catch (Throwable th2) {
            C25425OooO0O0.OooO0O0(inputStream);
            AbstractC25434OooO00o.OooOooo(null);
            throw th2;
        }
    }

    public abstract C25638OooO0oO OooO0OO(C25763OooO00o c25763OooO00o) throws IOException;

    public abstract String OooO0Oo();
}
