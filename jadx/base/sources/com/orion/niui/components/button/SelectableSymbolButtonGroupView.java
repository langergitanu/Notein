package com.orion.niui.components.button;

import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.ViewGroupKt;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import o0O0oOoo.C26157OooOO0o;
import o0O0oOoo.OooOOO;
import o0O0oOoo.OooOOO0;
import o0O0ooO0.EnumC26220OooO00o;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0O0O.C33567OooO0o0;
import oO0o0O0O.C33576OooOOOo;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0012\u001a\u00020\u00042\u001a\u0010\u0011\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0015\u001a\u00020\u00042\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m80612d2 = {"Lcom/orion/niui/components/button/SelectableSymbolButtonGroupView;", "Landroid/widget/LinearLayout;", "Lo0O0ooO0/OooO00o;", "mode", "LoO00ooO/OooOooO;", "setSelectionMode", "(Lo0O0ooO0/OooO00o;)V", "getSelectionMode", "()Lo0O0ooO0/OooO00o;", "", "", "getSelectedIds", "()Ljava/util/Set;", "ids", "setSelectedIds", "(Ljava/util/Set;)V", "Lkotlin/Function1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnSelectionChangedListener", "(LoO0O000o/OooOO0o;)V", "Lcom/orion/niui/components/button/SelectableSymbolButtonView;", "setOnChildClickListener", "", "useDarkTheme", "setUseDarkTheme", "(Ljava/lang/Boolean;)V", "ni-ui-components_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class SelectableSymbolButtonGroupView extends LinearLayout {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final /* synthetic */ int f69455OooOoo0 = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public InterfaceC32507OooOO0o<? super Set<Integer>, C32460OooOooO> f69456OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public EnumC26220OooO00o f69457OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f69458OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public InterfaceC32507OooOO0o<? super SelectableSymbolButtonView, C32460OooOooO> f69459OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Boolean f69460OooOoOO;

    public static final class OooO00o implements InterfaceC32507OooOO0o<Object, Boolean> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f69461OooOo0o = new OooO00o();

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof SelectableSymbolButtonView);
        }
    }

    public static final class OooO0O0 implements InterfaceC32507OooOO0o<Object, Boolean> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0O0 f69462OooOo0o = new OooO0O0();

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof SelectableSymbolButtonView);
        }
    }

    public static final class OooO0OO implements InterfaceC32507OooOO0o<Object, Boolean> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0OO f69463OooOo0o = new OooO0OO();

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof SelectableSymbolButtonView);
        }
    }

    /* JADX INFO: renamed from: com.orion.niui.components.button.SelectableSymbolButtonGroupView$OooO0Oo, reason: case insensitive filesystem */
    public static final class C22844OooO0Oo implements InterfaceC32507OooOO0o<Object, Boolean> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final C22844OooO0Oo f69464OooOo0o = new C22844OooO0Oo();

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof SelectableSymbolButtonView);
        }
    }

    public static int OooO0OO(View view) {
        if (view == null) {
            throw new IllegalArgumentException("Child view not found for provided id.");
        }
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        return view.getId();
    }

    public final void OooO00o() {
        this.f69458OooOoO = true;
        C33567OooO0o0.OooO00o oooO00o = new C33567OooO0o0.OooO00o(C33576OooOOOo.OooOOO0(ViewGroupKt.getChildren(this), OooO00o.f69461OooOo0o));
        if (oooO00o.hasNext()) {
            OooO0OO((SelectableSymbolButtonView) oooO00o.next());
            throw null;
        }
        this.f69458OooOoO = false;
    }

    public final void OooO0O0(SelectableSymbolButtonView selectableSymbolButtonView) {
        int iOooO0OO = OooO0OO(selectableSymbolButtonView);
        this.f69458OooOoO = true;
        selectableSymbolButtonView.setToggleOnClick(false);
        this.f69458OooOoO = false;
        selectableSymbolButtonView.setUseDarkTheme(this.f69460OooOoOO);
        selectableSymbolButtonView.setOnSelectionChangeListener(new C26157OooOO0o(this, iOooO0OO));
        if (!selectableSymbolButtonView.isSelected()) {
            selectableSymbolButtonView.setOnClickListener(new OooOOO0(this, selectableSymbolButtonView, 0));
        } else {
            if (this.f69457OooOo0o != EnumC26220OooO00o.f89587OooOo0o) {
                throw null;
            }
            throw null;
        }
    }

    public final Set<Integer> getSelectedIds() {
        throw null;
    }

    /* JADX INFO: renamed from: getSelectionMode, reason: from getter */
    public final EnumC26220OooO00o getF69457OooOo0o() {
        return this.f69457OooOo0o;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        C33567OooO0o0.OooO00o oooO00o = new C33567OooO0o0.OooO00o(C33576OooOOOo.OooOOO0(ViewGroupKt.getChildren(this), OooO0O0.f69462OooOo0o));
        while (oooO00o.hasNext()) {
            OooO0O0((SelectableSymbolButtonView) oooO00o.next());
        }
        OooO00o();
        if (!this.f69458OooOoO && this.f69456OooOo != null) {
            throw null;
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof SelectableSymbolButtonView) {
            OooO0O0((SelectableSymbolButtonView) view);
            OooO00o();
            if (!this.f69458OooOoO && this.f69456OooOo != null) {
                throw null;
            }
        }
    }

    public final void setOnChildClickListener(InterfaceC32507OooOO0o<? super SelectableSymbolButtonView, C32460OooOooO> listener) {
        this.f69459OooOoO0 = listener;
    }

    public final void setOnSelectionChangedListener(InterfaceC32507OooOO0o<? super Set<Integer>, C32460OooOooO> listener) {
        this.f69456OooOo = listener;
    }

    public final void setSelectedIds(Set<Integer> ids) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(ids, "ids");
        Set setOooOo0O = C33576OooOOOo.OooOo0O(C33576OooOOOo.OooOOoo(C33576OooOOOo.OooOOO0(ViewGroupKt.getChildren(this), OooO0OO.f69463OooOo0o), new OooOOO(this)));
        ArrayList arrayList = new ArrayList();
        for (Object obj : ids) {
            if (setOooOo0O.contains(Integer.valueOf(((Number) obj).intValue()))) {
                arrayList.add(obj);
            }
        }
        OooOo.o0OO00O(arrayList);
        throw null;
    }

    public final void setSelectionMode(EnumC26220OooO00o mode) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(mode, "mode");
        if (this.f69457OooOo0o == mode) {
            return;
        }
        this.f69457OooOo0o = mode;
        throw null;
    }

    public final void setUseDarkTheme(Boolean useDarkTheme) {
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(this.f69460OooOoOO, useDarkTheme)) {
            return;
        }
        this.f69460OooOoOO = useDarkTheme;
        C33567OooO0o0.OooO00o oooO00o = new C33567OooO0o0.OooO00o(C33576OooOOOo.OooOOO0(ViewGroupKt.getChildren(this), C22844OooO0Oo.f69464OooOo0o));
        while (oooO00o.hasNext()) {
            ((SelectableSymbolButtonView) oooO00o.next()).setUseDarkTheme(useDarkTheme);
        }
    }
}
