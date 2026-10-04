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
import com.google.firebase.firestore.local.OooO;
import com.orion.niui.components.button.TextButtonView;
import com.orion.notein.domain.models.material.MaterialActionType;
import com.orion.notein.p607ui.creative_library.C23033OooOO0o;
import kotlin.jvm.internal.OooOOO0;
import o0O0oOoo.EnumC26187OoooOOo;
import o0OOOoO.OooO0o;
import o0Oo0oOo.C28319OooOOOO;
import o0Oo0oOo.C28320OooOOOo;
import o0Oo0oOo.ViewOnClickListenerC28369o00000oO;
import o0Oo0oOo.ViewOnLayoutChangeListenerC28368o00000o0;
import o0Oo0oOo.o00000;
import oO0o0O0o.C33599OooOo0O;

/* JADX INFO: renamed from: com.orion.notein.ui.creative_library.Oooo0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C23059Oooo0oO extends AbstractC22050OooOo0o<C23033OooOO0o.OooO00o, OooO0O0> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C28319OooOOOO f71282OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C28320OooOOOo f71283OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f71284OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f71285OooO0o0;

    /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.Oooo0oO$OooO00o */
    public static final class OooO00o extends OooOOO.AbstractC22036OooO0o0<C23033OooOO0o.OooO00o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f71286OooO00o = new OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(C23033OooOO0o.OooO00o oooO00o, C23033OooOO0o.OooO00o oooO00o2) {
            return oooO00o.equals(oooO00o2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(C23033OooOO0o.OooO00o oooO00o, C23033OooOO0o.OooO00o oooO00o2) {
            return OooOOO0.OooO0O0(oooO00o.f71088OooO00o, oooO00o2.f71088OooO00o);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.Oooo0oO$OooO0O0 */
    public static final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO0o f71287OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final C28319OooOOOO f71288OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final C28320OooOOOo f71289OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final ViewOnLayoutChangeListenerC28368o00000o0 f71290OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Type inference failed for: r2v1, types: [o0Oo0oOo.o00000o0] */
        public OooO0O0(OooO0o oooO0o, C28319OooOOOO onItemClick, C28320OooOOOo onActionClick) {
            super(oooO0o.f94947OooO00o);
            OooOOO0.OooO0oO(onItemClick, "onItemClick");
            OooOOO0.OooO0oO(onActionClick, "onActionClick");
            this.f71287OooO00o = oooO0o;
            this.f71288OooO0O0 = onItemClick;
            this.f71289OooO0OO = onActionClick;
            this.f71290OooO0Oo = new View.OnLayoutChangeListener() { // from class: o0Oo0oOo.o00000o0
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    this.f100562OooOo0o.OooO00o();
                }
            };
        }

        public final void OooO00o() {
            OooO0o oooO0o = this.f71287OooO00o;
            int width = oooO0o.f94949OooO0OO.getWidth();
            if (width == 0) {
                oooO0o.f94949OooO0OO.post(new OooO(this, 1));
                return;
            }
            float f = oooO0o.f94947OooO00o.getResources().getDisplayMetrics().density;
            float f2 = width / (396.0f * f);
            ConstraintLayout constraintLayout = oooO0o.f94953OooO0oO;
            constraintLayout.setPivotX(0.0f);
            constraintLayout.setPivotY(0.0f);
            constraintLayout.setScaleX(f2);
            constraintLayout.setScaleY(f2);
            float f3 = f * 20.0f * f2;
            TextView textView = oooO0o.f94951OooO0o;
            textView.setTranslationX(f3);
            TextView textView2 = oooO0o.f94952OooO0o0;
            textView2.setTranslationX(f3);
            TextButtonView textButtonView = oooO0o.f94948OooO0O0;
            textButtonView.setTranslationX(-f3);
            textButtonView.setPivotX(textButtonView.getWidth());
            textButtonView.setPivotY(textButtonView.getHeight() / 2.0f);
            textButtonView.setScaleX(f2);
            textButtonView.setScaleY(f2);
            textView.setPivotX(0.0f);
            textView.setPivotY(textView.getHeight());
            textView.setScaleX(f2);
            textView.setScaleY(f2);
            textView2.setPivotX(0.0f);
            textView2.setPivotY(0.0f);
            textView2.setScaleX(f2);
            textView2.setScaleY(f2);
        }
    }

    public C23059Oooo0oO(C28319OooOOOO c28319OooOOOO, C28320OooOOOo c28320OooOOOo) {
        super(OooO00o.f71286OooO00o);
        this.f71282OooO0O0 = c28319OooOOOO;
        this.f71283OooO0OO = c28320OooOOOo;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        final OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        OooOOO0.OooO0oO(holder, "holder");
        C23033OooOO0o.OooO00o oooO00oOooO0OO = OooO0OO(i);
        OooOOO0.OooO0o(oooO00oOooO0OO, "getItem(...)");
        final C23033OooOO0o.OooO00o oooO00o = oooO00oOooO0OO;
        int i2 = this.f71284OooO0Oo;
        OooO0o oooO0o = holder.f71287OooO00o;
        if (i2 > 0) {
            ViewGroup.LayoutParams layoutParams = oooO0o.f94947OooO00o.getLayoutParams();
            layoutParams.width = i2;
            oooO0o.f94947OooO00o.setLayoutParams(layoutParams);
        }
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
        TextButtonView textButtonView = oooO0o.f94948OooO0O0;
        textButtonView.setVisibility(0);
        Context context = oooO0o.f94947OooO00o.getContext();
        OooOOO0.OooO0o(context, "getContext(...)");
        MaterialActionType materialActionType = oooO00o.f71094OooO0oO;
        textButtonView.setText(o00000.OooO00o(context, materialActionType));
        textButtonView.setEnabled(oooO00o.f71087OooO);
        textButtonView.setVariant(materialActionType == MaterialActionType.GO_TO_CREATE ? EnumC26187OoooOOo.f89410OooOoO0 : EnumC26187OoooOOo.f89408OooOo0o);
        textButtonView.setOnClickListener(new View.OnClickListener() { // from class: o0Oo0oOo.o0000Ooo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Exception {
                holder.f71289OooO0OO.invoke(oooO00o);
            }
        });
        ConstraintLayout constraintLayout = oooO0o.f94953OooO0oO;
        String str2 = oooO00o.f71093OooO0o0;
        if (str2 == null || C33599OooOo0O.Oooo0o0(str2)) {
            constraintLayout.setVisibility(8);
        } else {
            constraintLayout.setVisibility(0);
            oooO0o.f94954OooO0oo.setText(str2);
        }
        MaterialCardView materialCardView = oooO0o.f94949OooO0OO;
        ViewOnLayoutChangeListenerC28368o00000o0 viewOnLayoutChangeListenerC28368o00000o0 = holder.f71290OooO0Oo;
        materialCardView.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC28368o00000o0);
        materialCardView.addOnLayoutChangeListener(viewOnLayoutChangeListenerC28368o00000o0);
        holder.OooO00o();
        materialCardView.setOnClickListener(new ViewOnClickListenerC28369o00000oO(0, holder, oooO00o));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup parent, int i) {
        OooOOO0.OooO0oO(parent, "parent");
        return new OooO0O0(OooO0o.OooO00o(LayoutInflater.from(parent.getContext()), parent), this.f71282OooO0O0, this.f71283OooO0OO);
    }
}
