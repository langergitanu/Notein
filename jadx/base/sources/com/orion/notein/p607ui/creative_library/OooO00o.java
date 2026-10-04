package com.orion.notein.p607ui.creative_library;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.OooO0OO;
import com.google.android.material.card.MaterialCardView;
import com.orion.niui.components.button.TextButtonView;
import com.orion.notein.domain.models.material.MaterialActionType;
import com.orion.notein.p607ui.creative_library.C23033OooOO0o;
import kotlin.jvm.internal.OooOOO0;
import o0O0oOoo.EnumC26187OoooOOo;
import o0OOOoO.OooO0o;
import o0Oo0oOo.RunnableC28311OooO0o0;
import o0Oo0oOo.ViewOnLayoutChangeListenerC28306OooO00o;
import o0Oo0oOo.o00000;
import o0Oo0oOo.oo000o;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0O0o.C33599OooOo0O;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o extends AbstractC22050OooOo0o<C23033OooOO0o.OooO00o, OooO0O0> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC32507OooOO0o<C23033OooOO0o.OooO00o, C32460OooOooO> f70982OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC32507OooOO0o<C23033OooOO0o.OooO00o, C32460OooOooO> f70983OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public oo000o f70984OooO0Oo;

    /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C19171OooO00o extends OooOOO.AbstractC22036OooO0o0<C23033OooOO0o.OooO00o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C19171OooO00o f70985OooO00o = new C19171OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(C23033OooOO0o.OooO00o oooO00o, C23033OooOO0o.OooO00o oooO00o2) {
            return oooO00o.equals(oooO00o2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(C23033OooOO0o.OooO00o oooO00o, C23033OooOO0o.OooO00o oooO00o2) {
            return OooOOO0.OooO0O0(oooO00o.f71088OooO00o, oooO00o2.f71088OooO00o);
        }
    }

    public static final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO0o f70986OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final InterfaceC32507OooOO0o<C23033OooOO0o.OooO00o, C32460OooOooO> f70987OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final InterfaceC32507OooOO0o<C23033OooOO0o.OooO00o, C32460OooOooO> f70988OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final oo000o f70989OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final ViewOnLayoutChangeListenerC28306OooO00o f70990OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Type inference failed for: r2v1, types: [o0Oo0oOo.OooO00o] */
        public OooO0O0(OooO0o oooO0o, InterfaceC32507OooOO0o onItemClick, InterfaceC32507OooOO0o onActionClick, oo000o oo000oVar) {
            super(oooO0o.f94947OooO00o);
            OooOOO0.OooO0oO(onItemClick, "onItemClick");
            OooOOO0.OooO0oO(onActionClick, "onActionClick");
            this.f70986OooO00o = oooO0o;
            this.f70987OooO0O0 = onItemClick;
            this.f70988OooO0OO = onActionClick;
            this.f70989OooO0Oo = oo000oVar;
            this.f70990OooO0o0 = new View.OnLayoutChangeListener() { // from class: o0Oo0oOo.OooO00o
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    this.f100418OooOo0o.OooO00o();
                }
            };
        }

        public final void OooO00o() {
            OooO0o oooO0o = this.f70986OooO00o;
            int width = oooO0o.f94949OooO0OO.getWidth();
            if (width == 0) {
                oooO0o.f94949OooO0OO.post(new RunnableC28311OooO0o0(this, 0));
                return;
            }
            float f = oooO0o.f94947OooO00o.getResources().getDisplayMetrics().density;
            float f2 = 396.0f * f;
            float f3 = width / f2;
            C34406OooO00o.f123390OooO00o.OooO00o("cardWidth=" + width + ", baseWidthPx=" + f2 + ", scale=" + f3, new Object[0]);
            ConstraintLayout constraintLayout = oooO0o.f94953OooO0oO;
            constraintLayout.setPivotX(0.0f);
            constraintLayout.setPivotY(0.0f);
            constraintLayout.setScaleX(f3);
            constraintLayout.setScaleY(f3);
            float f4 = f * 20.0f * f3;
            TextView textView = oooO0o.f94951OooO0o;
            textView.setTranslationX(f4);
            TextView textView2 = oooO0o.f94952OooO0o0;
            textView2.setTranslationX(f4);
            TextButtonView textButtonView = oooO0o.f94948OooO0O0;
            textButtonView.setTranslationX(-f4);
            textButtonView.setPivotX(textButtonView.getWidth());
            textButtonView.setPivotY(textButtonView.getHeight() / 2.0f);
            textButtonView.setScaleX(f3);
            textButtonView.setScaleY(f3);
            textView.setPivotX(0.0f);
            textView.setPivotY(textView.getHeight());
            textView.setScaleX(f3);
            textView.setScaleY(f3);
            textView2.setPivotX(0.0f);
            textView2.setPivotY(0.0f);
            textView2.setScaleX(f3);
            textView2.setScaleY(f3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OooO00o(InterfaceC32507OooOO0o<? super C23033OooOO0o.OooO00o, C32460OooOooO> interfaceC32507OooOO0o, InterfaceC32507OooOO0o<? super C23033OooOO0o.OooO00o, C32460OooOooO> interfaceC32507OooOO0o2) {
        super(C19171OooO00o.f70985OooO00o);
        this.f70982OooO0O0 = interfaceC32507OooOO0o;
        this.f70983OooO0OO = interfaceC32507OooOO0o2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        final OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        OooOOO0.OooO0oO(holder, "holder");
        C23033OooOO0o.OooO00o oooO00oOooO0OO = OooO0OO(i);
        OooOOO0.OooO0o(oooO00oOooO0OO, "getItem(...)");
        final C23033OooOO0o.OooO00o oooO00o = oooO00oOooO0OO;
        OooO0o oooO0o = holder.f70986OooO00o;
        oooO0o.f94951OooO0o.setText(oooO00o.f71089OooO0O0);
        ImageView imageView = oooO0o.f94950OooO0Oo;
        OooO0OO.OooO0o0(imageView).OooOO0O(oooO00o.f71091OooO0Oo).OoooO0(imageView);
        TextView textView = oooO0o.f94952OooO0o0;
        String str = oooO00o.f71090OooO0OO;
        if (str == null || C33599OooOo0O.Oooo0o0(str)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
        }
        Context context = oooO0o.f94947OooO00o.getContext();
        OooOOO0.OooO0o(context, "getContext(...)");
        MaterialActionType materialActionType = oooO00o.f71094OooO0oO;
        String strOooO00o = o00000.OooO00o(context, materialActionType);
        TextButtonView textButtonView = oooO0o.f94948OooO0O0;
        textButtonView.setText(strOooO00o);
        textButtonView.setEnabled(oooO00o.f71087OooO);
        textButtonView.setVariant(materialActionType == MaterialActionType.GO_TO_CREATE ? EnumC26187OoooOOo.f89410OooOoO0 : EnumC26187OoooOOo.f89408OooOo0o);
        ConstraintLayout constraintLayout = oooO0o.f94953OooO0oO;
        String str2 = oooO00o.f71093OooO0o0;
        if (str2 == null || C33599OooOo0O.Oooo0o0(str2)) {
            constraintLayout.setVisibility(8);
        } else {
            constraintLayout.setVisibility(0);
            oooO0o.f94954OooO0oo.setText(str2);
        }
        MaterialCardView materialCardView = oooO0o.f94949OooO0OO;
        ViewOnLayoutChangeListenerC28306OooO00o viewOnLayoutChangeListenerC28306OooO00o = holder.f70990OooO0o0;
        materialCardView.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC28306OooO00o);
        materialCardView.addOnLayoutChangeListener(viewOnLayoutChangeListenerC28306OooO00o);
        holder.OooO00o();
        materialCardView.setOnClickListener(new View.OnClickListener() { // from class: o0Oo0oOo.OooO0O0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                holder.f70987OooO0O0.invoke(oooO00o);
            }
        });
        materialCardView.setOnLongClickListener(new View.OnLongClickListener() { // from class: o0Oo0oOo.OooO0OO
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                oo000o oo000oVar = holder.f70989OooO0Oo;
                if (oo000oVar == null) {
                    return false;
                }
                kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
                oo000oVar.invoke(oooO00o, view);
                return Boolean.TRUE.booleanValue();
            }
        });
        textButtonView.setOnClickListener(new View.OnClickListener() { // from class: o0Oo0oOo.OooO0Oo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                holder.f70988OooO0OO.invoke(oooO00o);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup parent, int i) {
        OooOOO0.OooO0oO(parent, "parent");
        return new OooO0O0(OooO0o.OooO00o(LayoutInflater.from(parent.getContext()), parent), this.f70982OooO0O0, this.f70983OooO0OO, this.f70984OooO0Oo);
    }
}
