package o00oo0Oo;

import OooooO0.C21294OooOO0O;
import android.graphics.Paint;
import android.text.TextPaint;
import com.facebook.imagepipeline.producers.C22300OooooO0;
import com.facebook.imagepipeline.producers.InterfaceC22291OoooO0O;
import com.orion.notein.p607ui.widget.NoteInSidebar;
import o00oo.C25638OooO0oO;
import o00ooO.C25732OooO0O0;
import o0O0oooO.AbstractApplicationC26277OooOoOO;

/* JADX INFO: renamed from: o00oo0Oo.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C25709OooOoo implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f87758OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f87759OooOo0o;

    public /* synthetic */ C25709OooOoo(Object obj, int i) {
        this.f87759OooOo0o = i;
        this.f87758OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        Object obj = this.f87758OooOo;
        switch (this.f87759OooOo0o) {
            case 0:
                C25722OoooO00 this$0 = (C25722OoooO00) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(this$0, "this$0");
                C25732OooO0O0.OooO00o();
                InterfaceC22291OoooO0O<C25638OooO0oO> interfaceC22291OoooO0OOooO0O0 = this$0.OooO0O0();
                this$0.f87785OooO0O0.getClass();
                return new C22300OooooO0(interfaceC22291OoooO0OOooO0O0);
            case 1:
                return C21294OooOO0O.OooO0Oo((AbstractApplicationC26277OooOoOO) obj, "notein-toolbar-sp");
            default:
                int i = NoteInSidebar.f80104OoooOoo;
                TextPaint textPaint = new TextPaint(1);
                textPaint.setColor(((NoteInSidebar) obj).f80123Oooo0oO);
                textPaint.setTextSize(r0.f80121Oooo0o);
                textPaint.setTextAlign(Paint.Align.CENTER);
                return textPaint;
        }
    }
}
