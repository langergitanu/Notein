package o0OO00o0;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.provider.MediaStore;
import com.aspose.words.StyleIdentifier;
import java.util.Map;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OOo.C33711OooOo00;
import oO0o0OOo.InterfaceC33712OooOo0O;

/* JADX INFO: renamed from: o0OO00o0.o00O0Oo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.ImageRepoImpl$getLatestImagesInDevices$1", m80623f = "ImageRepoImpl.kt", m80624l = {StyleIdentifier.LIST_TABLE_2}, m80625m = "invokeSuspend")
public final class C26592o00O0Oo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33712OooOo0O<? super Map<String, ? extends Uri>>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f91706OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f91707OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C26596o00O0o0 f91708OooOoO0;

    /* JADX INFO: renamed from: o0OO00o0.o00O0Oo0$OooO00o */
    public static final class OooO00o extends ContentObserver {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33712OooOo0O<Map<String, ? extends Uri>> f91709OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ o00O0OOO f91710OooO0O0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Handler handler, InterfaceC33712OooOo0O interfaceC33712OooOo0O, o00O0OOO o00o0ooo2) {
            super(handler);
            this.f91709OooO00o = interfaceC33712OooOo0O;
            this.f91710OooO0O0 = o00o0ooo2;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z) {
            super.onChange(z);
            this.f91709OooO00o.OooO0o0((Map<String, ? extends Uri>) this.f91710OooO0O0.invoke());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26592o00O0Oo0(C26596o00O0o0 c26596o00O0o0, Continuation<? super C26592o00O0Oo0> continuation) {
        super(2, continuation);
        this.f91708OooOoO0 = c26596o00O0o0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26592o00O0Oo0 c26592o00O0Oo0 = new C26592o00O0Oo0(this.f91708OooOoO0, continuation);
        c26592o00O0Oo0.f91706OooOo = obj;
        return c26592o00O0Oo0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33712OooOo0O<? super Map<String, ? extends Uri>> interfaceC33712OooOo0O, Continuation<? super C32460OooOooO> continuation) {
        return ((C26592o00O0Oo0) create(interfaceC33712OooOo0O, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f91707OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33712OooOo0O interfaceC33712OooOo0O = (InterfaceC33712OooOo0O) this.f91706OooOo;
            Uri contentUri = Build.VERSION.SDK_INT >= 29 ? MediaStore.Images.Media.getContentUri("external") : MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            final C26596o00O0o0 c26596o00O0o0 = this.f91708OooOoO0;
            o00O0OOO o00o0ooo2 = new o00O0OOO(c26596o00O0o0, contentUri);
            interfaceC33712OooOo0O.OooO0o0(o00o0ooo2.invoke());
            final HandlerThread handlerThread = new HandlerThread("content_observer");
            handlerThread.start();
            final OooO00o oooO00o = new OooO00o(new Handler(handlerThread.getLooper()), interfaceC33712OooOo0O, o00o0ooo2);
            c26596o00O0o0.f91722OooO0OO.getContentResolver().registerContentObserver(contentUri, true, oooO00o);
            oO0O000o.OooO00o oooO00o2 = new oO0O000o.OooO00o() { // from class: o0OO00o0.o00O0OOo
                @Override // oO0O000o.OooO00o
                public final Object invoke() {
                    handlerThread.quit();
                    c26596o00O0o0.f91722OooO0OO.getContentResolver().unregisterContentObserver(oooO00o);
                    return C32460OooOooO.f116667OooO00o;
                }
            };
            this.f91707OooOo0o = 1;
            if (C33711OooOo00.OooO00o(interfaceC33712OooOo0O, oooO00o2, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
