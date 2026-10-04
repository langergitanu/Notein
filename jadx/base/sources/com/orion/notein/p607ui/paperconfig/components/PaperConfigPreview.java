package com.orion.notein.p607ui.paperconfig.components;

import Oooo0.o000000O;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.page.PaperOrientation;
import com.orion.notein.domain.models.papertheme.LambdaPaperTheme;
import com.orion.notein.domain.models.papertheme.LocalResPaperTheme;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.domain.models.papertheme.paperstyle.NonePaperStyle;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0Oo0o0o.C28264OoooO0O;
import o0OoO000.OooO0OO;
import o0o00oo.ViewOnClickListenerC30096OooO0OO;
import o0o0OOOo.EnumC30545OooO00o;
import o0o0OOOo.EnumC30546OooO0O0;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010\u001eR0\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006("}, m80612d2 = {"Lcom/orion/notein/ui/paperconfig/components/PaperConfigPreview;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/orion/notein/domain/models/papertheme/PaperTheme;", "paperTheme", "LoO00ooO/OooOooO;", "setSelectedPaperTheme", "(Lcom/orion/notein/domain/models/papertheme/PaperTheme;)V", "coverTheme", "setSelectedCoverTheme", "Lo0o0OOOo/OooO0O0;", C18437z2.f56754h, "setSelectedType", "(Lo0o0OOOo/OooO0O0;)V", "getSelectedType", "()Lo0o0OOOo/OooO0O0;", "Lo0o0OOOo/OooO00o;", "mode", "setDisplayMode", "(Lo0o0OOOo/OooO00o;)V", "", "visible", "setMoreButtonVisible", "(Z)V", "Landroid/view/View$OnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setMoreButtonClickListener", "(Landroid/view/View$OnClickListener;)V", "", NoteMeta.PROPERTY_TITLE, "setPaperTitle", "(Ljava/lang/String;)V", "setCoverTitle", "Lkotlin/Function1;", "Oooo000", "LoO0O000o/OooOO0o;", "getOnPreviewTypeClickListener", "()LoO0O000o/OooOO0o;", "setOnPreviewTypeClickListener", "(LoO0O000o/OooOO0o;)V", "onPreviewTypeClickListener", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class PaperConfigPreview extends ConstraintLayout {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public ImageView f78692OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public ImageView f78693OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public TextView f78694OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public TextView f78695OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public ImageView f78696OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public ConstraintLayout f78697OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public ConstraintLayout f78698OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public EnumC30546OooO0O0 f78699OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public EnumC30545OooO00o f78700OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name and from kotlin metadata */
    public InterfaceC32507OooOO0o<? super EnumC30546OooO0O0, C32460OooOooO> onPreviewTypeClickListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaperConfigPreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        OooOOO0.OooO0oO(context, "context");
        this.f78699OooOooO = EnumC30546OooO0O0.f109263OooOo;
        this.f78700OooOooo = EnumC30545OooO00o.f109261OooOo0o;
        LayoutInflater.from(context).inflate(R.layout.component_paper_config_preview, (ViewGroup) this, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO00o(PaperTheme paperTheme, ImageView imageView) {
        if (paperTheme instanceof LocalResPaperTheme) {
            Context context = imageView.getContext();
            OooOOO0.OooO0o(context, "getContext(...)");
            imageView.setImageResource(((LocalResPaperTheme) paperTheme).getTnResourceId(context));
        } else {
            C32443OooOOO c32443OooOOO = paperTheme.getOrientation() == PaperOrientation.VERTICAL ? new C32443OooOOO(Integer.valueOf(o000000O.OooO0o(93)), Integer.valueOf(o000000O.OooO0o(130))) : new C32443OooOOO(Integer.valueOf(o000000O.OooO0o(130)), Integer.valueOf(o000000O.OooO0o(93)));
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((Number) c32443OooOOO.f116638OooOo0o).intValue(), ((Number) c32443OooOOO.f116637OooOo).intValue(), Bitmap.Config.ARGB_8888);
            boolean z = paperTheme instanceof LambdaPaperTheme;
            PaperTheme paperThemeOooO0O0 = paperTheme;
            if (z) {
                LambdaPaperTheme lambdaPaperTheme = (LambdaPaperTheme) paperTheme;
                boolean z2 = lambdaPaperTheme.getPaperStyle() instanceof NonePaperStyle;
                paperThemeOooO0O0 = lambdaPaperTheme;
                if (z2) {
                    Context context2 = getContext();
                    OooOOO0.OooO0o(context2, "getContext(...)");
                    LambdaPaperTheme lambdaPaperThemeOooO00o = C28264OoooO0O.OooO00o(lambdaPaperTheme, context2);
                    Context context3 = getContext();
                    OooOOO0.OooO0o(context3, "getContext(...)");
                    paperThemeOooO0O0 = C28264OoooO0O.OooO0O0(lambdaPaperThemeOooO00o, context3);
                }
            }
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Context context4 = getContext();
            OooOOO0.OooO0o(context4, "getContext(...)");
            paperThemeOooO0O0.drawPaperBg(canvas, context4);
            imageView.setImageBitmap(bitmapCreateBitmap);
            OooOOO0.OooO0Oo(bitmapCreateBitmap);
        }
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    public final void OooO0O0() {
        int iOrdinal = this.f78699OooOooO.ordinal();
        if (iOrdinal == 0) {
            ConstraintLayout constraintLayout = this.f78698OooOoo0;
            if (constraintLayout == null) {
                OooOOO0.OooOOOO("coverContainer");
                throw null;
            }
            constraintLayout.setSelected(true);
            ConstraintLayout constraintLayout2 = this.f78697OooOoo;
            if (constraintLayout2 != null) {
                constraintLayout2.setSelected(false);
                return;
            } else {
                OooOOO0.OooOOOO("paperContainer");
                throw null;
            }
        }
        if (iOrdinal != 1) {
            throw new C32442OooOO0o();
        }
        ConstraintLayout constraintLayout3 = this.f78698OooOoo0;
        if (constraintLayout3 == null) {
            OooOOO0.OooOOOO("coverContainer");
            throw null;
        }
        constraintLayout3.setSelected(false);
        ConstraintLayout constraintLayout4 = this.f78697OooOoo;
        if (constraintLayout4 != null) {
            constraintLayout4.setSelected(true);
        } else {
            OooOOO0.OooOOOO("paperContainer");
            throw null;
        }
    }

    public final InterfaceC32507OooOO0o<EnumC30546OooO0O0, C32460OooOooO> getOnPreviewTypeClickListener() {
        return this.onPreviewTypeClickListener;
    }

    /* JADX INFO: renamed from: getSelectedType, reason: from getter */
    public final EnumC30546OooO0O0 getF78699OooOooO() {
        return this.f78699OooOooO;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f78698OooOoo0 = (ConstraintLayout) findViewById(R.id.cover_container);
        this.f78697OooOoo = (ConstraintLayout) findViewById(R.id.paper_container);
        this.f78693OooOo0o = (ImageView) findViewById(R.id.cover_preview);
        this.f78692OooOo = (ImageView) findViewById(R.id.paper_preview);
        this.f78695OooOoO0 = (TextView) findViewById(R.id.cover_title);
        this.f78694OooOoO = (TextView) findViewById(R.id.paper_title);
        this.f78696OooOoOO = (ImageView) findViewById(R.id.btn_more_options);
        ConstraintLayout constraintLayout = this.f78698OooOoo0;
        if (constraintLayout == null) {
            OooOOO0.OooOOOO("coverContainer");
            throw null;
        }
        constraintLayout.setOnClickListener(new ViewOnClickListenerC30096OooO0OO(this, 1));
        ConstraintLayout constraintLayout2 = this.f78697OooOoo;
        if (constraintLayout2 == null) {
            OooOOO0.OooOOOO("paperContainer");
            throw null;
        }
        constraintLayout2.setOnClickListener(new OooO0OO(this, 3));
        OooO0O0();
    }

    public final void setCoverTitle(String title) {
        OooOOO0.OooO0oO(title, "title");
        TextView textView = this.f78695OooOoO0;
        if (textView != null) {
            textView.setText(title);
        } else {
            OooOOO0.OooOOOO("coverTitle");
            throw null;
        }
    }

    public final void setDisplayMode(EnumC30545OooO00o mode) {
        OooOOO0.OooO0oO(mode, "mode");
        if (this.f78700OooOooo != mode) {
            this.f78700OooOooo = mode;
            int iOrdinal = mode.ordinal();
            if (iOrdinal == 0) {
                ConstraintLayout constraintLayout = this.f78698OooOoo0;
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(0);
                    return;
                } else {
                    OooOOO0.OooOOOO("coverContainer");
                    throw null;
                }
            }
            if (iOrdinal != 1) {
                throw new C32442OooOO0o();
            }
            ConstraintLayout constraintLayout2 = this.f78698OooOoo0;
            if (constraintLayout2 == null) {
                OooOOO0.OooOOOO("coverContainer");
                throw null;
            }
            constraintLayout2.setVisibility(8);
            if (this.f78699OooOooO == EnumC30546OooO0O0.f109264OooOo0o) {
                ConstraintLayout constraintLayout3 = this.f78697OooOoo;
                if (constraintLayout3 != null) {
                    constraintLayout3.performClick();
                } else {
                    OooOOO0.OooOOOO("paperContainer");
                    throw null;
                }
            }
        }
    }

    public final void setMoreButtonClickListener(View.OnClickListener listener) {
        ImageView imageView = this.f78696OooOoOO;
        if (imageView != null) {
            imageView.setOnClickListener(listener);
        } else {
            OooOOO0.OooOOOO("btnMoreOptions");
            throw null;
        }
    }

    public final void setMoreButtonVisible(boolean visible) {
        ImageView imageView = this.f78696OooOoOO;
        if (imageView != null) {
            imageView.setVisibility(visible ? 0 : 8);
        } else {
            OooOOO0.OooOOOO("btnMoreOptions");
            throw null;
        }
    }

    public final void setOnPreviewTypeClickListener(InterfaceC32507OooOO0o<? super EnumC30546OooO0O0, C32460OooOooO> interfaceC32507OooOO0o) {
        this.onPreviewTypeClickListener = interfaceC32507OooOO0o;
    }

    public final void setPaperTitle(String title) {
        OooOOO0.OooO0oO(title, "title");
        TextView textView = this.f78694OooOoO;
        if (textView != null) {
            textView.setText(title);
        } else {
            OooOOO0.OooOOOO("paperTitle");
            throw null;
        }
    }

    public final void setSelectedCoverTheme(PaperTheme coverTheme) {
        OooOOO0.OooO0oO(coverTheme, "coverTheme");
        ImageView imageView = this.f78693OooOo0o;
        if (imageView != null) {
            OooO00o(coverTheme, imageView);
        } else {
            OooOOO0.OooOOOO("coverPreview");
            throw null;
        }
    }

    public final void setSelectedPaperTheme(PaperTheme paperTheme) {
        OooOOO0.OooO0oO(paperTheme, "paperTheme");
        ImageView imageView = this.f78692OooOo;
        if (imageView != null) {
            OooO00o(paperTheme, imageView);
        } else {
            OooOOO0.OooOOOO("paperPreview");
            throw null;
        }
    }

    public final void setSelectedType(EnumC30546OooO0O0 type) {
        OooOOO0.OooO0oO(type, "type");
        if (this.f78699OooOooO != type) {
            this.f78699OooOooO = type;
            OooO0O0();
        }
    }
}
