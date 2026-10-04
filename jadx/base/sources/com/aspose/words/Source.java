package com.aspose.words;

import com.aspose.words.ref.RefInt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class Source {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("AbbreviatedCaseNumber", "AlbumTitle", "BookTitle", "Broadcaster", "BroadcastTitle", "CaseNumber", "ChapterNumber", "City", "Comments", "ConferenceName", "CountryRegion", "Court", "Day", "DayAccessed", "Department", "Distributor", "Edition", "Guid", "Institution", "InternetSiteTitle", "Issue", "JournalName", "LCID", "Medium", "Month", "MonthAccessed", "NumberVolumes", "Pages", "PatentNumber", "PeriodicalTitle", "ProductionCompany", "PublicationTitle", "Publisher", "RecordingNumber", "RefOrder", "Reporter", "ShortTitle", "StandardNumber", "StateProvince", "Station", "Tag", "Theater", "ThesisType", "Title", "Type", "URL", "Version", "Volume", "Year", "YearAccessed", "SourceType", "Author", "NameList", "Corporate", "Person", "Last", "First", "Middle");
    private String zzAn;
    private int zzRo;
    private String zzXCk;
    private String zzXd5;
    private String zzXd6;
    private String zzXd7;
    private String zzXd8;
    private String zzXd9;
    private String zzXdA;
    private String zzXdB;
    private String zzXdC;
    private String zzXdD;
    private String zzXdE;
    private String zzXdF;
    private String zzXdG;
    private String zzXdH;
    private String zzXdI;
    private String zzXdJ;
    private String zzXdK;
    private String zzXdL;
    private String zzXdM;
    private int zzXdP;
    private String zzXda;
    private String zzXdb;
    private String zzXdc;
    private String zzXdd;
    private String zzXde;
    private String zzXdf;
    private String zzXdg;
    private String zzXdh;
    private String zzXdi;
    private String zzXdj;
    private String zzXdk;
    private String zzXdl;
    private String zzXdm;
    private String zzXdn;
    private String zzXdo;
    private String zzXdp;
    private String zzXdq;
    private String zzXdr;
    private String zzXds;
    private String zzXdt;
    private String zzXdu;
    private String zzXdv;
    private String zzXdw;
    private String zzXdx;
    private String zzXdy;
    private String zzXdz;
    private String zzYKX;
    private String zzZiH;
    private String zzZj;
    private String zzZpX;
    private String zzmP;
    private boolean zzXdO = false;
    private ContributorCollection zzXdN = new ContributorCollection();

    public static class zzZ {
        private static Map<String, Integer> zzXd4 = zzY7C();
        private static Map<String, Integer> zzXd3 = zzY7B();

        private static Corporate zzQ(com.aspose.words.internal.zzO zzo) {
            return new Corporate(zzo.readString());
        }

        private static Person zzR(com.aspose.words.internal.zzO zzo) {
            String string = null;
            String string2 = null;
            String string3 = null;
            while (zzo.zzQ("Person")) {
                switch (Source.zzUR.zzTP(zzo.getLocalName())) {
                    case 55:
                        string = zzo.readString();
                        break;
                    case 56:
                        string2 = zzo.readString();
                        break;
                    case 57:
                        string3 = zzo.readString();
                        break;
                }
            }
            return new Person(string, string2, string3);
        }

        private static PersonCollection zzS(com.aspose.words.internal.zzO zzo) {
            PersonCollection personCollection = new PersonCollection();
            while (zzo.zzQ("NameList")) {
                if (Source.zzUR.zzTP(zzo.getLocalName()) == 54) {
                    personCollection.zzY(zzR(zzo));
                }
            }
            return personCollection;
        }

        private static Contributor zzT(com.aspose.words.internal.zzO zzo) {
            String localName = zzo.getLocalName();
            Contributor contributorZzQ = null;
            while (zzo.zzQ(localName)) {
                int iZzTP = Source.zzUR.zzTP(zzo.getLocalName());
                if (iZzTP == 52) {
                    contributorZzQ = zzS(zzo);
                } else if (iZzTP == 53) {
                    contributorZzQ = zzQ(zzo);
                }
            }
            return contributorZzQ;
        }

        public static void zzX(Source source) {
            com.aspose.words.internal.zzO zzo = new com.aspose.words.internal.zzO(source.zzXd5, (Map<String, String>) null);
            while (zzo.zzQ("Source")) {
                switch (Source.zzUR.zzTP(zzo.getLocalName())) {
                    case 0:
                        source.zzXdM = zzo.readString();
                        break;
                    case 1:
                        source.zzXdL = zzo.readString();
                        break;
                    case 2:
                        source.zzXdK = zzo.readString();
                        break;
                    case 3:
                        source.zzXdJ = zzo.readString();
                        break;
                    case 4:
                        source.zzXdI = zzo.readString();
                        break;
                    case 5:
                        source.zzXdH = zzo.readString();
                        break;
                    case 6:
                        source.zzXdG = zzo.readString();
                        break;
                    case 7:
                        source.zzXdF = zzo.readString();
                        break;
                    case 8:
                        source.zzZiH = zzo.readString();
                        break;
                    case 9:
                        source.zzXdE = zzo.readString();
                        break;
                    case 10:
                        source.zzXdD = zzo.readString();
                        break;
                    case 11:
                        source.zzXdC = zzo.readString();
                        break;
                    case 12:
                        source.zzXdB = zzo.readString();
                        break;
                    case 13:
                        source.zzXdA = zzo.readString();
                        break;
                    case 14:
                        source.zzXdz = zzo.readString();
                        break;
                    case 15:
                        source.zzXdy = zzo.readString();
                        break;
                    case 16:
                        source.zzXdx = zzo.readString();
                        break;
                    case 17:
                        source.zzXdw = zzo.readString();
                        break;
                    case 18:
                        source.zzXdv = zzo.readString();
                        break;
                    case 19:
                        source.zzXdu = zzo.readString();
                        break;
                    case 20:
                        source.zzXdt = zzo.readString();
                        break;
                    case 21:
                        source.zzXds = zzo.readString();
                        break;
                    case 22:
                        source.zzB3(zzo.readString());
                        break;
                    case 23:
                        source.zzXdr = zzo.readString();
                        break;
                    case 24:
                        source.zzXdq = zzo.readString();
                        break;
                    case 25:
                        source.zzXdp = zzo.readString();
                        break;
                    case 26:
                        source.zzXdo = zzo.readString();
                        break;
                    case 27:
                        source.zzXdn = zzo.readString();
                        break;
                    case 28:
                        source.zzXdm = zzo.readString();
                        break;
                    case 29:
                        source.zzXdl = zzo.readString();
                        break;
                    case 30:
                        source.zzXdk = zzo.readString();
                        break;
                    case 31:
                        source.zzXdj = zzo.readString();
                        break;
                    case 32:
                        source.zzYKX = zzo.readString();
                        break;
                    case 33:
                        source.zzXdi = zzo.readString();
                        break;
                    case 34:
                        source.zzXdh = zzo.readString();
                        break;
                    case 35:
                        source.zzXdg = zzo.readString();
                        break;
                    case 36:
                        source.zzXdf = zzo.readString();
                        break;
                    case 37:
                        source.zzXde = zzo.readString();
                        break;
                    case 38:
                        source.zzXdd = zzo.readString();
                        break;
                    case 39:
                        source.zzXdc = zzo.readString();
                        break;
                    case 40:
                        source.zzXCk = zzo.readString();
                        break;
                    case 41:
                        source.zzXdb = zzo.readString();
                        break;
                    case 42:
                        source.zzXda = zzo.readString();
                        break;
                    case 43:
                        source.zzZj = zzo.readString();
                        break;
                    case 44:
                        source.zzmP = zzo.readString();
                        break;
                    case 45:
                        source.zzZpX = zzo.readString();
                        break;
                    case 46:
                        source.zzAn = zzo.readString();
                        break;
                    case 47:
                        source.zzXd9 = zzo.readString();
                        break;
                    case 48:
                        source.zzXd8 = zzo.readString();
                        break;
                    case 49:
                        source.zzXd7 = zzo.readString();
                        break;
                    case 50:
                        RefInt refInt = new RefInt(0);
                        boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ(zzXd4, zzo.readString(), refInt);
                        int i = refInt.get();
                        if (!zZzZ) {
                            i = 16;
                        }
                        source.zzRo = i;
                        break;
                    case 51:
                        zzZ(zzo, source.getContributors());
                        break;
                }
            }
        }

        private static Map<String, Integer> zzY7B() {
            HashMap map = new HashMap();
            OooO0OO.OooO0O0(0, map, "Artist", 1, "Author");
            OooO0OO.OooO0O0(2, map, "BookAuthor", 3, "Compiler");
            OooO0OO.OooO0O0(4, map, "Composer", 5, "Conductor");
            OooO0OO.OooO0O0(6, map, "Counsel", 7, "Director");
            OooO0OO.OooO0O0(8, map, "Editor", 9, "Interviewee");
            OooO0OO.OooO0O0(10, map, "Interviewer", 11, "Inventor");
            OooO0OO.OooO0O0(12, map, "Performer", 13, "ProducerName");
            OooO0OO.OooO0O0(14, map, "Translator", 15, "Writer");
            return map;
        }

        private static Map<String, Integer> zzY7C() {
            HashMap map = new HashMap();
            OooO0OO.OooO0O0(0, map, "ArticleInAPeriodical", 1, "Book");
            OooO0OO.OooO0O0(2, map, "BookSection", 3, "JournalArticle");
            OooO0OO.OooO0O0(4, map, "ConferenceProceedings", 5, "Report");
            OooO0OO.OooO0O0(6, map, "SoundRecording", 7, "Performance");
            OooO0OO.OooO0O0(8, map, "Art", 9, "DocumentFromInternetSite");
            OooO0OO.OooO0O0(10, map, "InternetSite", 11, "Film");
            OooO0OO.OooO0O0(12, map, "Interview", 13, "Patent");
            OooO0OO.OooO0O0(14, map, "ElectronicSource", 15, "Case");
            map.put("Misc", 16);
            return map;
        }

        private static void zzZ(com.aspose.words.internal.zzO zzo, ContributorCollection contributorCollection) {
            Contributor contributorZzT;
            while (zzo.zzQ("Author")) {
                RefInt refInt = new RefInt(0);
                boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ(zzXd3, zzo.getLocalName(), refInt);
                int i = refInt.get();
                if (zZzZ && (contributorZzT = zzT(zzo)) != null) {
                    contributorCollection.zzZ(contributorZzT, i);
                }
            }
        }
    }

    public Source(String str) {
        this.zzXd5 = str;
        zzZ.zzX(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zzB3(String str) {
        if (com.aspose.words.internal.zzZKN.equals(this.zzXd6, str)) {
            return;
        }
        this.zzXd6 = str;
        zzY7G();
    }

    private void zzY7G() {
        com.aspose.words.internal.zz7I zz7iZzZn = com.aspose.words.internal.zzJB.zzZn(getLcid());
        com.aspose.words.internal.zzZP1 zzzp1ZzSV = zz7iZzZn.hasValue() ? com.aspose.words.internal.zzZXR.zzSV(zz7iZzZn.getValue()) : com.aspose.words.internal.zzZXR.zzWY(getLcid());
        if (zzzp1ZzSV == null) {
            this.zzXdO = false;
        } else {
            this.zzXdP = zzzp1ZzSV.zzj9().intValue();
            this.zzXdO = true;
        }
    }

    public final String getAbbreviatedCaseNumber() {
        return this.zzXdM;
    }

    public final String getAlbumTitle() {
        return this.zzXdL;
    }

    public final String getBookTitle() {
        return this.zzXdK;
    }

    public final String getBroadcastTitle() {
        return this.zzXdI;
    }

    public final String getBroadcaster() {
        return this.zzXdJ;
    }

    public final String getCaseNumber() {
        return this.zzXdH;
    }

    public final String getChapterNumber() {
        return this.zzXdG;
    }

    public final String getCity() {
        return this.zzXdF;
    }

    public final String getComments() {
        return this.zzZiH;
    }

    public final String getConferenceName() {
        return this.zzXdE;
    }

    public final ContributorCollection getContributors() {
        return this.zzXdN;
    }

    public final String getCountryOrRegion() {
        return this.zzXdD;
    }

    public final String getCourt() {
        return this.zzXdC;
    }

    public final String getDay() {
        return this.zzXdB;
    }

    public final String getDayAccessed() {
        return this.zzXdA;
    }

    public final String getDepartment() {
        return this.zzXdz;
    }

    public final String getDistributor() {
        return this.zzXdy;
    }

    public final String getEdition() {
        return this.zzXdx;
    }

    public final String getGuid() {
        return this.zzXdw;
    }

    public final String getInstitution() {
        return this.zzXdv;
    }

    public final String getInternetSiteTitle() {
        return this.zzXdu;
    }

    public final String getIssue() {
        return this.zzXdt;
    }

    public final String getJournalName() {
        return this.zzXds;
    }

    public final String getLcid() {
        return this.zzXd6;
    }

    public final String getMedium() {
        return this.zzXdr;
    }

    public final String getMonth() {
        return this.zzXdq;
    }

    public final String getMonthAccessed() {
        return this.zzXdp;
    }

    public final String getNumberVolumes() {
        return this.zzXdo;
    }

    public final String getPages() {
        return this.zzXdn;
    }

    public final String getPatentNumber() {
        return this.zzXdm;
    }

    public final String getPeriodicalTitle() {
        return this.zzXdl;
    }

    public final String getProductionCompany() {
        return this.zzXdk;
    }

    public final String getPublicationTitle() {
        return this.zzXdj;
    }

    public final String getPublisher() {
        return this.zzYKX;
    }

    public final String getRecordingNumber() {
        return this.zzXdi;
    }

    public final String getRefOrder() {
        return this.zzXdh;
    }

    public final String getReporter() {
        return this.zzXdg;
    }

    public final String getShortTitle() {
        return this.zzXdf;
    }

    public final int getSourceType() {
        return this.zzRo;
    }

    public final String getStandardNumber() {
        return this.zzXde;
    }

    public final String getStateOrProvince() {
        return this.zzXdd;
    }

    public final String getStation() {
        return this.zzXdc;
    }

    public final String getTag() {
        return this.zzXCk;
    }

    public final String getTheater() {
        return this.zzXdb;
    }

    public final String getThesisType() {
        return this.zzXda;
    }

    public final String getTitle() {
        return this.zzZj;
    }

    public final String getType() {
        return this.zzmP;
    }

    public final String getUrl() {
        return this.zzZpX;
    }

    public final String getVersion() {
        return this.zzAn;
    }

    public final String getVolume() {
        return this.zzXd9;
    }

    public final String getYear() {
        return this.zzXd8;
    }

    public final String getYearAccessed() {
        return this.zzXd7;
    }

    public final boolean zzY7E() {
        return this.zzXdO;
    }

    public final int zzY7F() {
        return this.zzXdP;
    }

    public final ArrayList<Person> zzY7H() {
        ArrayList<Person> arrayList = new ArrayList<>();
        Iterator<Contributor> it = getContributors().iterator();
        while (it.hasNext()) {
            PersonCollection personCollection = (PersonCollection) com.aspose.words.internal.zzZKW.zzZ(it.next(), PersonCollection.class);
            if (personCollection != null) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList) arrayList, (Iterable) personCollection);
            }
        }
        return arrayList;
    }

    public final String zzY7I() {
        if (this.zzXdO && !com.aspose.words.internal.zzZKN.equals(Integer.toString(this.zzXdP), getLcid())) {
            return this.zzXd5.replace(com.aspose.words.internal.zzZKN.format("<b:LCID>{0}</b:LCID>", getLcid()), com.aspose.words.internal.zzZKN.format("<b:LCID>{0}</b:LCID>", Integer.valueOf(this.zzXdP)));
        }
        return this.zzXd5;
    }
}
