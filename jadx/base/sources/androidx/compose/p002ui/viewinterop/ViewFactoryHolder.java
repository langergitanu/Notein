package androidx.compose.p002ui.viewinterop;

import OoooOOO.InterfaceC21182OooO0o0;
import android.view.View;
import androidx.compose.p002ui.platform.AbstractComposeView;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o00Oo0.C25027OooO0O0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004R(\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nRB\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\f2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013RB\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\f2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013RB\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\f2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\u0017\u0010\u001d\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010 ¨\u0006("}, m80612d2 = {"Landroidx/compose/ui/viewinterop/ViewFactoryHolder;", "Landroid/view/View;", "T", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "", "LOoooOOO/OooO0o0$OooO00o;", "value", "Oooo0O0", "LOoooOOO/OooO0o0$OooO00o;", "setSaveableRegistryEntry", "(LOoooOOO/OooO0o0$OooO00o;)V", "saveableRegistryEntry", "Lkotlin/Function1;", "LoO00ooO/OooOooO;", "Oooo0OO", "LoO0O000o/OooOO0o;", "getUpdateBlock", "()LoO0O000o/OooOO0o;", "setUpdateBlock", "(LoO0O000o/OooOO0o;)V", "updateBlock", "Oooo0o0", "getResetBlock", "setResetBlock", "resetBlock", "Oooo0o", "getReleaseBlock", "setReleaseBlock", "releaseBlock", "typedView", "Landroid/view/View;", "getTypedView", "()Landroid/view/View;", "Lo00Oo0/OooO0O0;", "dispatcher", "Lo00Oo0/OooO0O0;", "getDispatcher", "()Lo00Oo0/OooO0O0;", "getViewRoot", "viewRoot", "ui_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class ViewFactoryHolder<T extends View> extends AndroidViewHolder {

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name and from kotlin metadata */
    public InterfaceC21182OooO0o0.OooO00o saveableRegistryEntry;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name and from kotlin metadata */
    public InterfaceC32507OooOO0o<? super T, C32460OooOooO> updateBlock;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name and from kotlin metadata */
    public InterfaceC32507OooOO0o<? super T, C32460OooOooO> releaseBlock;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name and from kotlin metadata */
    public InterfaceC32507OooOO0o<? super T, C32460OooOooO> resetBlock;

    public static final class OooO00o extends OooOOOO implements oO0O000o.OooO00o<C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ ViewFactoryHolder<T> f63558OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(ViewFactoryHolder<T> viewFactoryHolder) {
            super(0);
            this.f63558OooOo0o = viewFactoryHolder;
        }

        @Override // oO0O000o.OooO00o
        public final C32460OooOooO invoke() {
            ViewFactoryHolder<T> viewFactoryHolder = this.f63558OooOo0o;
            viewFactoryHolder.getReleaseBlock().invoke(viewFactoryHolder.getTypedView());
            ViewFactoryHolder.OooO00o(viewFactoryHolder);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ ViewFactoryHolder<T> f63559OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(ViewFactoryHolder<T> viewFactoryHolder) {
            super(0);
            this.f63559OooOo0o = viewFactoryHolder;
        }

        @Override // oO0O000o.OooO00o
        public final C32460OooOooO invoke() {
            ViewFactoryHolder<T> viewFactoryHolder = this.f63559OooOo0o;
            viewFactoryHolder.getResetBlock().invoke(viewFactoryHolder.getTypedView());
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ ViewFactoryHolder<T> f63560OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(ViewFactoryHolder<T> viewFactoryHolder) {
            super(0);
            this.f63560OooOo0o = viewFactoryHolder;
        }

        @Override // oO0O000o.OooO00o
        public final C32460OooOooO invoke() {
            ViewFactoryHolder<T> viewFactoryHolder = this.f63560OooOo0o;
            viewFactoryHolder.getUpdateBlock().invoke(viewFactoryHolder.getTypedView());
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final void OooO00o(ViewFactoryHolder viewFactoryHolder) {
        viewFactoryHolder.setSaveableRegistryEntry(null);
    }

    private final void setSaveableRegistryEntry(InterfaceC21182OooO0o0.OooO00o oooO00o) {
        InterfaceC21182OooO0o0.OooO00o oooO00o2 = this.saveableRegistryEntry;
        if (oooO00o2 != null) {
            oooO00o2.unregister();
        }
        this.saveableRegistryEntry = oooO00o;
    }

    public final C25027OooO0O0 getDispatcher() {
        return null;
    }

    public final InterfaceC32507OooOO0o<T, C32460OooOooO> getReleaseBlock() {
        return this.releaseBlock;
    }

    public final InterfaceC32507OooOO0o<T, C32460OooOooO> getResetBlock() {
        return this.resetBlock;
    }

    public /* bridge */ /* synthetic */ AbstractComposeView getSubCompositionView() {
        return null;
    }

    public final T getTypedView() {
        return null;
    }

    public final InterfaceC32507OooOO0o<T, C32460OooOooO> getUpdateBlock() {
        return this.updateBlock;
    }

    public View getViewRoot() {
        return this;
    }

    public final void setReleaseBlock(InterfaceC32507OooOO0o<? super T, C32460OooOooO> value) {
        OooOOO0.OooO0oO(value, "value");
        this.releaseBlock = value;
        setRelease(new OooO00o(this));
    }

    public final void setResetBlock(InterfaceC32507OooOO0o<? super T, C32460OooOooO> value) {
        OooOOO0.OooO0oO(value, "value");
        this.resetBlock = value;
        setReset(new OooO0O0(this));
    }

    public final void setUpdateBlock(InterfaceC32507OooOO0o<? super T, C32460OooOooO> value) {
        OooOOO0.OooO0oO(value, "value");
        this.updateBlock = value;
        setUpdate(new OooO0OO(this));
    }
}
