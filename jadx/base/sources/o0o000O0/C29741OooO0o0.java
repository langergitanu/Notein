package o0o000O0;

import com.orion.notein.p607ui.noteeditor.shapeeditor.AnchorAssistLinePaintingDelegate;
import com.orion.penkit.models.AnchorAssistLine;
import com.orion.penkit.models.AnchorAssistLinePainter;
import com.orion.penkit.models.OnAssistLinesChangedListener;
import java.util.Iterator;
import java.util.Set;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34438OooOoo0;
import oOoo0.InterfaceC34602OooOO0o;

/* JADX INFO: renamed from: o0o000O0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29741OooO0o0 extends oO0O00o0.OooO00o<Set<? extends AnchorAssistLine<?>>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ AnchorAssistLinePaintingDelegate f105467OooO00o;

    /* JADX WARN: Illegal instructions before constructor call */
    public C29741OooO0o0(AnchorAssistLinePaintingDelegate anchorAssistLinePaintingDelegate) {
        C34438OooOoo0 c34438OooOoo0 = C34438OooOoo0.f123458OooOo0o;
        this.f105467OooO00o = anchorAssistLinePaintingDelegate;
        super(c34438OooOoo0);
    }

    @Override // oO0O00o0.OooO00o
    public final void afterChange(InterfaceC34602OooOO0o<?> property, Set<? extends AnchorAssistLine<?>> set, Set<? extends AnchorAssistLine<?>> set2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(property, "property");
        Set<? extends AnchorAssistLine<?>> set3 = set;
        Set<? extends AnchorAssistLine<?>> set4 = set2;
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("AnchorAssistLineTAG");
        final AnchorAssistLinePaintingDelegate anchorAssistLinePaintingDelegate = this.f105467OooO00o;
        c20358OooO00o.OooO00o("mAssistLines changed, " + anchorAssistLinePaintingDelegate.getOnAssistLineChangeListener() + ", lines:" + set4 + ". ", new Object[0]);
        OnAssistLinesChangedListener<Integer> onAssistLineChangeListener = anchorAssistLinePaintingDelegate.getOnAssistLineChangeListener();
        if (onAssistLineChangeListener != null) {
            kotlin.jvm.internal.OooOOO0.OooO0o0(set4, "null cannot be cast to non-null type kotlin.collections.Set<com.orion.penkit.models.AnchorAssistLine<kotlin.Int>>");
            onAssistLineChangeListener.onAssistLinesChanged(set4);
        }
        if (set3.isEmpty() && set4.isEmpty()) {
            return;
        }
        if (set4.isEmpty()) {
            anchorAssistLinePaintingDelegate.getMainHandler().postDelayed(new Runnable() { // from class: o0o000O0.OooO0Oo
                @Override // java.lang.Runnable
                public final void run() {
                    anchorAssistLinePaintingDelegate.OooO0o0();
                }
            }, anchorAssistLinePaintingDelegate.f76277OooOoo0);
            return;
        }
        anchorAssistLinePaintingDelegate.OooO0o0();
        Iterator<T> it = set4.iterator();
        while (it.hasNext()) {
            AnchorAssistLinePainter.INSTANCE.drawAssistLine((AnchorAssistLine) it.next(), anchorAssistLinePaintingDelegate.getAnchorAssistLineCanvas());
        }
        anchorAssistLinePaintingDelegate.invalidate();
    }
}
