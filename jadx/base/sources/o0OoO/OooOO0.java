package o0OoO;

import com.orion.notein.p607ui.noteeditor.addimage.ImageEditorPanel;
import java.util.Iterator;
import java.util.List;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addimage.ImageEditorPanel", m80623f = "ImageEditorPanel.kt", m80624l = {393}, m80625m = "showMultiImages")
public final class OooOO0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public List f101052OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public ImageEditorPanel f101053OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public ImageEditorPanel.OooO0O0 f101054OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Iterator f101055OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f101056OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f101057OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f101058OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public /* synthetic */ Object f101059OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ ImageEditorPanel f101060OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public int f101061Oooo000;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(ImageEditorPanel imageEditorPanel, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f101060OooOooo = imageEditorPanel;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f101059OooOooO = obj;
        this.f101061Oooo000 |= Integer.MIN_VALUE;
        return this.f101060OooOooo.OooOO0O(null, false, this);
    }
}
