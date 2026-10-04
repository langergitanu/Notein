package o0OOo0oo;

import com.orion.notein.domain.models.cloudsync.CloudEvent;
import kotlin.coroutines.Continuation;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOo0oo.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27611OooO<T> implements InterfaceC33723OooO0oO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C27618OooO0oO f97088OooOo0o;

    /* JADX INFO: renamed from: o0OOo0oo.OooO$OooO00o */
    public /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f97089OooO00o;

        static {
            int[] iArr = new int[CloudEvent.MetaEvent.Type.values().length];
            try {
                iArr[CloudEvent.MetaEvent.Type.CLOUD_UPDATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CloudEvent.MetaEvent.Type.CLOUD_DELETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f97089OooO00o = iArr;
        }
    }

    public C27611OooO(C27618OooO0oO c27618OooO0oO) {
        this.f97088OooOo0o = c27618OooO0oO;
    }

    @Override // oO0o0Oo.InterfaceC33723OooO0oO
    public final Object emit(Object obj, Continuation continuation) {
        CloudEvent cloudEvent = (CloudEvent) obj;
        boolean z = cloudEvent instanceof CloudEvent.MetaBatchEvent;
        C27618OooO0oO c27618OooO0oO = this.f97088OooOo0o;
        if (z) {
            for (CloudEvent.MetaEvent metaEvent : ((CloudEvent.MetaBatchEvent) cloudEvent).getChanges()) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("CloudEventHandlerUseCase");
                c20358OooO00o.OooO0o0("CloudEvent: " + metaEvent.getChangeType() + ", id=" + metaEvent.getMetaId(), new Object[0]);
                int i = OooO00o.f97089OooO00o[metaEvent.getChangeType().ordinal()];
                if (i == 1) {
                    c27618OooO0oO.f97112OooO0OO.OooO0O0(metaEvent.getMetaId(), metaEvent.getDirtyCloudMeta());
                } else {
                    if (i != 2) {
                        throw new C32442OooOO0o();
                    }
                    c27618OooO0oO.f97112OooO0OO.OooO00o(metaEvent.getMetaId(), metaEvent.getDirtyCloudMeta());
                }
            }
        } else if (cloudEvent instanceof CloudEvent.ErrorEvent) {
            c27618OooO0oO.f97115OooO0o0.OooO00o(((CloudEvent.ErrorEvent) cloudEvent).getError());
        } else if (cloudEvent instanceof CloudEvent.AccountEvent) {
            Object objOooO00o = C27618OooO0oO.OooO00o(c27618OooO0oO, (CloudEvent.AccountEvent) cloudEvent, continuation);
            return objOooO00o == EnumC32485OooO00o.f116726OooOo0o ? objOooO00o : C32460OooOooO.f116667OooO00o;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
