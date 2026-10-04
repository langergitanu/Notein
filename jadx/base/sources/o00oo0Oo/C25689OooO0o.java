package o00oo0Oo;

import android.view.MotionEvent;
import com.orion.notein.p607ui.noteeditor.shapeeditor.ShapesAnchorEditor;
import java.util.concurrent.ExecutorService;
import o00o0OOo.InterfaceC25413OooO0oo;
import o00o0o0o.C25451OooOO0;
import o00oo0O0.C25661OooO0o;
import o00ooO0.C25750OooOoOO;
import o00ooO0.C25754OooOooo;

/* JADX INFO: renamed from: o00oo0Oo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C25689OooO0o implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f87641OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f87642OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f87643OooOoO0;

    public /* synthetic */ C25689OooO0o(int i, Object obj, Object obj2) {
        this.f87642OooOo0o = i;
        this.f87641OooOo = obj;
        this.f87643OooOoO0 = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, oO00ooO.OooOO0] */
    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        Object obj = this.f87643OooOoO0;
        Object obj2 = this.f87641OooOo;
        switch (this.f87642OooOo0o) {
            case 0:
                C25694OooOO0O this$0 = (C25694OooOO0O) obj2;
                kotlin.jvm.internal.OooOOO0.OooO0oO(this$0, "this$0");
                C25695OooOO0o this$1 = (C25695OooOO0o) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(this$1, "this$1");
                InterfaceC25413OooO0oo interfaceC25413OooO0oo = (InterfaceC25413OooO0oo) this$0.f87650OooO00o.getValue();
                int i = this$1.f87662OooO0o0;
                C25754OooOooo c25754OooOooo = this$1.f87658OooO0O0;
                C25750OooOoOO c25750OooOoOOOooO0O0 = c25754OooOooo.OooO0O0(i);
                kotlin.jvm.internal.OooOOO0.OooO0o(c25750OooOoOOOooO0O0, "getPooledByteBufferFactory(...)");
                C25451OooOO0 c25451OooOO0OooO0OO = c25754OooOooo.OooO0OO();
                kotlin.jvm.internal.OooOOO0.OooO0o(c25451OooOO0OooO0OO, "getPooledByteStreams(...)");
                InterfaceC25699OooOOOo interfaceC25699OooOOOo = this$1.f87659OooO0OO;
                ExecutorService executorServiceOooO0OO = interfaceC25699OooOOOo.OooO0OO();
                kotlin.jvm.internal.OooOOO0.OooO0o(executorServiceOooO0OO, "forLocalStorageRead(...)");
                ExecutorService executorServiceOooO0o0 = interfaceC25699OooOOOo.OooO0o0();
                kotlin.jvm.internal.OooOOO0.OooO0o(executorServiceOooO0o0, "forLocalStorageWrite(...)");
                return new C25661OooO0o(interfaceC25413OooO0oo, c25750OooOoOOOooO0O0, c25451OooOO0OooO0OO, executorServiceOooO0OO, executorServiceOooO0o0, this$1.f87660OooO0Oo);
            default:
                int i2 = ShapesAnchorEditor.f76279OoooO00;
                return Float.valueOf(((MotionEvent) obj2).getX() - ((ShapesAnchorEditor) obj).f76293Oooo0OO.x);
        }
    }
}
