package o00oo0Oo;

import android.graphics.Paint;
import android.text.TextPaint;
import com.facebook.imagepipeline.producers.C22301OooooOO;
import com.facebook.imagepipeline.producers.InterfaceC22291OoooO0O;
import com.orion.notein.p607ui.widget.NoteInSidebar;
import o00ooO.C25732OooO0O0;

/* JADX INFO: renamed from: o00oo0Oo.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C25710OooOoo0 implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f87760OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f87761OooOo0o;

    public /* synthetic */ C25710OooOoo0(Object obj, int i) {
        this.f87761OooOo0o = i;
        this.f87760OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        Object obj = this.f87760OooOo;
        switch (this.f87761OooOo0o) {
            case 0:
                C25722OoooO00 this$0 = (C25722OoooO00) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(this$0, "this$0");
                C25732OooO0O0.OooO00o();
                InterfaceC22291OoooO0O interfaceC22291OoooO0O = (InterfaceC22291OoooO0O) this$0.f87794OooOO0o.getValue();
                this$0.f87785OooO0O0.getClass();
                return new C22301OooooOO(interfaceC22291OoooO0O, this$0.f87789OooO0o0);
            default:
                int i = NoteInSidebar.f80104OoooOoo;
                TextPaint textPaint = new TextPaint(1);
                textPaint.setTextSize(((NoteInSidebar) obj).f80113OooOooo);
                textPaint.setTextAlign(Paint.Align.CENTER);
                return textPaint;
        }
    }
}
