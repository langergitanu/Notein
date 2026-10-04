package com.orion.notein.domain.mapper;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.data.p602db.entity.MyTemplateEntity;
import com.orion.notein.domain.models.page.PaperSpec;
import com.orion.notein.domain.models.papertheme.ColorPaperTheme;
import com.orion.notein.domain.models.papertheme.LambdaPaperTheme;
import com.orion.notein.domain.models.papertheme.LocalResPaperTheme;
import com.orion.notein.domain.models.papertheme.LocalUriPaperTheme;
import com.orion.notein.domain.models.papertheme.MyTemplate;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.domain.models.papertheme.PdfPaperTheme;
import com.orion.notein.domain.models.papertheme.PdfSetPaperTheme;
import com.orion.notein.domain.models.papertheme.TemplateBookPaperTheme;
import com.orion.notein.domain.models.papertheme.TemplateMaterialPaperTheme;
import com.orion.notein.domain.models.papertheme.paperstyle.AccenturePaperStyle;
import com.orion.notein.domain.models.papertheme.paperstyle.AccenturePaperStyleFixed1;
import com.orion.notein.domain.models.papertheme.paperstyle.BlankPaperStyle;
import com.orion.notein.domain.models.papertheme.paperstyle.CornellPaperStyle;
import com.orion.notein.domain.models.papertheme.paperstyle.DotPaperStyle;
import com.orion.notein.domain.models.papertheme.paperstyle.EnglishPaperStyle;
import com.orion.notein.domain.models.papertheme.paperstyle.LawPaperStyle;
import com.orion.notein.domain.models.papertheme.paperstyle.LinePaperStyle;
import com.orion.notein.domain.models.papertheme.paperstyle.MattsPaperStyle;
import com.orion.notein.domain.models.papertheme.paperstyle.MusicPaperStyle;
import com.orion.notein.domain.models.papertheme.paperstyle.NewCornellPaperStyle;
import com.orion.notein.domain.models.papertheme.paperstyle.NewCornellPaperStyleFixed1;
import com.orion.notein.domain.models.papertheme.paperstyle.NewDotPaperStyle;
import com.orion.notein.domain.models.papertheme.paperstyle.NewLawPaperStyle;
import com.orion.notein.domain.models.papertheme.paperstyle.NewLawPaperStyleFixed1;
import com.orion.notein.domain.models.papertheme.paperstyle.NewLinePaperStyle;
import com.orion.notein.domain.models.papertheme.paperstyle.NewSquarePaperStyle;
import com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle;
import com.orion.notein.domain.models.papertheme.paperstyle.SquarePaperStyle;
import com.orion.notein.domain.models.papertheme.paperstyle.UnboundedDotPaperStyle;
import com.orion.notein.domain.models.papertheme.paperstyle.UnboundedLinePaperStyle;
import com.orion.notein.domain.models.papertheme.paperstyle.UnboundedSquarePaperStyle;
import com.orion.notein.domain.models.papertheme.paperstyle.threecolumns.LineThreeColumnPaperStyle;
import com.orion.notein.domain.models.papertheme.paperstyle.threecolumns.LineThreeColumnPaperStyleFixed1;
import com.orion.notein.domain.models.papertheme.paperstyle.threecolumns.SquareThreeColumnPaperStyle;
import com.orion.notein.domain.models.papertheme.paperstyle.threecolumns.SquareThreeColumnPaperStyleFixed1;
import com.orion.notein.domain.models.papertheme.paperstyle.twocolumns.BlankTwoColumnPaperStyle;
import com.orion.notein.domain.models.papertheme.paperstyle.twocolumns.DotTwoColumnPaperStyle;
import com.orion.notein.domain.models.papertheme.paperstyle.twocolumns.LineTwoColumnPaperStyle;
import com.orion.notein.domain.models.papertheme.paperstyle.twocolumns.SquareTwoColumnPaperStyle;

/* JADX INFO: loaded from: classes9.dex */
public abstract class MyTemplateMapper {
    static Gson gson;

    static {
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryRegisterSubtype = RuntimeTypeAdapterFactory.m80562of(PaperTheme.class, C18437z2.f56754h).registerSubtype(ColorPaperTheme.class, ColorPaperTheme.class.getName()).registerSubtype(LocalResPaperTheme.class, LocalResPaperTheme.class.getName()).registerSubtype(LambdaPaperTheme.class, LambdaPaperTheme.class.getName()).registerSubtype(PdfPaperTheme.class, PdfPaperTheme.class.getName()).registerSubtype(PdfSetPaperTheme.class, PdfSetPaperTheme.class.getName()).registerSubtype(LocalUriPaperTheme.class, LocalUriPaperTheme.class.getName()).registerSubtype(TemplateMaterialPaperTheme.class, TemplateMaterialPaperTheme.class.getName()).registerSubtype(TemplateBookPaperTheme.class, TemplateBookPaperTheme.class.getName());
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactoryRegisterSubtype2 = RuntimeTypeAdapterFactory.m80562of(PaperStyle.class, C18437z2.f56754h).registerSubtype(BlankPaperStyle.class, BlankPaperStyle.class.getName()).registerSubtype(CornellPaperStyle.class, CornellPaperStyle.class.getName()).registerSubtype(DotPaperStyle.class, DotPaperStyle.class.getName()).registerSubtype(EnglishPaperStyle.class, EnglishPaperStyle.class.getName()).registerSubtype(LawPaperStyle.class, LawPaperStyle.class.getName()).registerSubtype(LinePaperStyle.class, LinePaperStyle.class.getName()).registerSubtype(MattsPaperStyle.class, MattsPaperStyle.class.getName()).registerSubtype(MusicPaperStyle.class, MusicPaperStyle.class.getName()).registerSubtype(SquarePaperStyle.class, SquarePaperStyle.class.getName()).registerSubtype(UnboundedLinePaperStyle.class, UnboundedLinePaperStyle.class.getName()).registerSubtype(UnboundedSquarePaperStyle.class, UnboundedSquarePaperStyle.class.getName()).registerSubtype(UnboundedDotPaperStyle.class, UnboundedDotPaperStyle.class.getName()).registerSubtype(LineThreeColumnPaperStyle.class, LineThreeColumnPaperStyle.class.getName()).registerSubtype(LineThreeColumnPaperStyleFixed1.class, LineThreeColumnPaperStyleFixed1.class.getName()).registerSubtype(SquareThreeColumnPaperStyle.class, SquareThreeColumnPaperStyle.class.getName()).registerSubtype(SquareThreeColumnPaperStyleFixed1.class, SquareThreeColumnPaperStyleFixed1.class.getName()).registerSubtype(LineTwoColumnPaperStyle.class, LineTwoColumnPaperStyle.class.getName()).registerSubtype(SquareTwoColumnPaperStyle.class, SquareTwoColumnPaperStyle.class.getName()).registerSubtype(DotTwoColumnPaperStyle.class, DotTwoColumnPaperStyle.class.getName()).registerSubtype(BlankTwoColumnPaperStyle.class, BlankTwoColumnPaperStyle.class.getName()).registerSubtype(AccenturePaperStyle.class, AccenturePaperStyle.class.getName()).registerSubtype(AccenturePaperStyleFixed1.class, AccenturePaperStyleFixed1.class.getName()).registerSubtype(NewSquarePaperStyle.class, NewSquarePaperStyle.class.getName()).registerSubtype(NewDotPaperStyle.class, NewDotPaperStyle.class.getName()).registerSubtype(NewLinePaperStyle.class, NewLinePaperStyle.class.getName()).registerSubtype(NewLawPaperStyle.class, NewLawPaperStyle.class.getName()).registerSubtype(NewLawPaperStyleFixed1.class, NewLawPaperStyleFixed1.class.getName()).registerSubtype(NewCornellPaperStyle.class, NewCornellPaperStyle.class.getName()).registerSubtype(NewCornellPaperStyleFixed1.class, NewCornellPaperStyleFixed1.class.getName());
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(runtimeTypeAdapterFactoryRegisterSubtype).registerTypeAdapterFactory(runtimeTypeAdapterFactoryRegisterSubtype2);
        gson = gsonBuilder.excludeFieldsWithoutExposeAnnotation().create();
    }

    public void fillEntity(MyTemplate myTemplate, MyTemplateEntity myTemplateEntity) {
        myTemplateEntity.setPaperThemeJson(gson.toJson(myTemplate.getPaperTheme(), PaperTheme.class));
        myTemplateEntity.setPaperSpecJson(new Gson().toJson(myTemplate.getPaperSpec()));
    }

    public void fillModel(MyTemplateEntity myTemplateEntity, MyTemplate myTemplate) {
        myTemplate.setPaperTheme((PaperTheme) gson.fromJson(myTemplateEntity.getPaperThemeJson(), PaperTheme.class));
        myTemplate.setPaperSpec((PaperSpec) new Gson().fromJson(myTemplateEntity.getPaperSpecJson(), PaperSpec.class));
    }

    public abstract MyTemplateEntity toEntity(MyTemplate myTemplate);

    public abstract MyTemplate toMyTemplate(MyTemplateEntity myTemplateEntity);
}
