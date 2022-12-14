package com.groupnine.project.Data.V8;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="climatedata8")
public class ClimateV8 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int year;
    private Double Afghanistan;
    private Double Albania;
    private Double Algeria;
    private Double Andorra;
    private Double Angola;
    private Double Anguilla;
    private Double Antigua_and_Barbuda;
    private Double Argentina;
    private Double Armenia;
    private Double Aruba;
    private Double Australia;
    private Double Austria;
    private Double Azerbaijan;
    private Double Bahamas;
    private Double Bahrain;
    private Double Bangladesh;
    private Double Barbados;
    private Double Belarus;
    private Double Belgium;
    private Double Belize;
    private Double Benin;
    private Double Bermuda;
    private Double Bhutan;
    private Double Bonaire_Saint_Eustatius_and_Saba;
    private Double Bosnia_and_Herzegovina;
    private Double Botswana;
    private Double Brazil;
    private Double British_Virgin_Islands;
    private Double Brunei_Darussalam;
    private Double Bulgaria;
    private Double Burkina_Faso;
    private Double Burundi;
    private Double Cambodia;
    private Double Canada;
    private Double Cape_Verde;
    private Double Central_African_Republic;
    private Double Chad;
    private Double Chile;
    private Double China;
    private Double Colombia;
    private Double Comoros;
    private Double Congo;
    private Double Cook_Islands;
    private Double Costa_Rica;
    /* private Double Cote_dIvoire; */
    private Double Croatia;
    private Double Cuba;
    private Double Curaçao;
    private Double Cyprus;
    private Double Czech_Republic;
    private Double North_Korea;
    private Double Democratic_Republic_of_the_Congo;
    private Double Denmark;
    private Double Djibouti;
    private Double Dominica;
    private Double Dominican_Republic;
    private Double Ecuador;
    private Double Egypt;
    private Double El_Salvador;
    private Double Equatorial_Guinea;
    private Double Eritrea;
    private Double Estonia;
    private Double Ethiopia;
    private Double Faeroe_Islands;
    private Double Micronesia;
    private Double Fiji;
    private Double Finland;
    private Double France;
    private Double French_Guiana;
    private Double French_Polynesia;
    private Double Gabon;
    private Double Gambia;
    private Double Georgia;
    private Double Germany;
    private Double Ghana;
    private Double Greece;
    private Double Greenland;
    private Double Grenada;
    private Double Guadeloupe;
    private Double Guatemala;
    private Double Guinea;
    private Double Guinea_Bissau;
    private Double Guyana;
    private Double Haiti;
    private Double Honduras;
    private Double Hong_Kong;
    private Double Hungary;
    private Double Iceland;
    private Double India;
    private Double Indonesia;
    private Double Iraq;
    private Double Ireland;
    private Double Iran;
    private Double Israel;
    private Double Italy;
    private Double Jamaica;
    private Double Japan;
    private Double Jordan;
    private Double Kazakhstan;
    private Double Kenya;
    private Double Kiribati;
    private Double Kosovo;
    private Double Kuwait;
    private Double Kyrgyzstan;
    private Double Laos;
    private Double Latvia;
    private Double Lebanon;
    private Double Lesotho;
    private Double Liberia;
    private Double Libya;
    private Double Liechtenstein;
    private Double Lithuania;
    private Double Luxembourg;
    private Double Macao;
    private Double North_Macedonia;
    private Double Madagascar;
    private Double Malawi;
    private Double Malaysia;
    private Double Maldives;
    private Double Mali;
    private Double Malta;
    private Double Marshall_Islands;
    private Double Martinique;
    private Double Mauritania;
    private Double Mauritius;
    private Double Mayotte;
    private Double Mexico;
    private Double Mongolia;
    private Double Montenegro;
    private Double Montserrat;
    private Double Morocco;
    private Double Mozambique;
    private Double Myanmar;
    private Double Namibia;
    private Double Nauru;
    private Double Nepal;
    private Double Netherlands;
    private Double New_Caledonia;
    private Double New_Zealand;
    private Double Nicaragua;
    private Double Niger;
    private Double Nigeria;
    private Double Niue;
    private Double Norway;
    private Double Occupied_Palestinian_Territory;
    private Double Oman;
    private Double Pakistan;
    private Double Palau;
    private Double Panama;
    private Double Papua_New_Guinea;
    private Double Paraguay;
    private Double Peru;
    private Double Philippines;
    private Double Bolivia;
    private Double Poland;
    private Double Portugal;
    private Double Qatar;
    private Double Cameroon;
    private Double South_Korea;
    private Double Moldova;
    private Double South_Sudan;
    private Double Sudan;
    private Double Réunion;
    private Double Romania;
    private Double Russian_Federation;
    private Double Rwanda;
    private Double Saint_Helena;
    private Double Saint_Lucia;
    private Double Sint_Maarten_Dutch_part;
    private Double Samoa;
    private Double Sao_Tome_and_Principe;
    private Double Saudi_Arabia;
    private Double Senegal;
    private Double Serbia;
    private Double Seychelles;
    private Double Sierra_Leone;
    private Double Singapore;
    private Double Slovakia;
    private Double Slovenia;
    private Double Solomon_Islands;
    private Double Somalia;
    private Double South_Africa;
    private Double Spain;
    private Double Sri_Lanka;
    private Double Saint_Kitts_and_Nevis;
    private Double Saint_Pierre_and_Miquelon;
    private Double Saint_Vincent_and_the_Grenadines;
    private Double Suriname;
    private Double Swaziland;
    private Double Sweden;
    private Double Switzerland;
    private Double Syria;
    private Double Taiwan;
    private Double Tajikistan;
    private Double Thailand;
    private Double Timor_Leste;
    private Double Togo;
    private Double Tonga;
    private Double Trinidad_and_Tobago;
    private Double Tunisia;
    private Double Turkey;
    private Double Turkmenistan;
    private Double Turks_and_Caicos_Islands;
    private Double Tuvalu;
    private Double Uganda;
    private Double Ukraine;
    private Double United_Arab_Emirates;
    private Double United_Kingdom;
    private Double Tanzania;
    private Double USA;
    private Double Uruguay;
    private Double Uzbekistan;
    private Double Vanuatu;
    private Double Venezuela;
    private Double Viet_Nam;
    private Double Wallis_and_Futuna_Islands;
    private Double Yemen;
    private Double Zambia;
    private Double Zimbabwe;
    private Double KP_Annex_B;
    private Double Non_KP_Annex_B;
    private Double OECD;
    private Double Non_OECD;
    private Double EU27;
    private Double Africa;
    private Double Asia;
    private Double Central_America;
    private Double Europe;
    private Double Middle_East;
    private Double North_America;
    private Double Oceania;
    private Double South_America;
    private Double Bunkers;
    private Double Statistical_Difference;
    private Double World;


    public int getYear() {
        return this.year;
    }

    public Double getAfghanistan() {
        return this.Afghanistan;
    }

    public Double getAlbania() {
        return this.Albania;
    }

    public Double getAlgeria() {
        return this.Algeria;
    }

    public Double getAndorra() {
        return this.Andorra;
    }

    public Double getAngola() {
        return this.Angola;
    }

    public Double getAnguilla() {
        return this.Anguilla;
    }

    public Double getAntigua_and_Barbuda() {
        return this.Antigua_and_Barbuda;
    }

    public Double getArgentina() {
        return this.Argentina;
    }

    public Double getArmenia() {
        return this.Armenia;
    }

    public Double getAruba() {
        return this.Aruba;
    }

    public Double getAustralia() {
        return this.Australia;
    }

    public Double getAustria() {
        return this.Austria;
    }

    public Double getAzerbaijan() {
        return this.Azerbaijan;
    }

    public Double getBahamas() {
        return this.Bahamas;
    }

    public Double getBahrain() {
        return this.Bahrain;
    }

    public Double getBangladesh() {
        return this.Bangladesh;
    }

    public Double getBarbados() {
        return this.Barbados;
    }

    public Double getBelarus() {
        return this.Belarus;
    }

    public Double getBelgium() {
        return this.Belgium;
    }

    public Double getBelize() {
        return this.Belize;
    }

    public Double getBenin() {
        return this.Benin;
    }

    public Double getBermuda() {
        return this.Bermuda;
    }

    public Double getBhutan() {
        return this.Bhutan;
    }

    public Double getBonaire_Saint_Eustatius_and_Saba() {
        return this.Bonaire_Saint_Eustatius_and_Saba;
    }

    public Double getBosnia_and_Herzegovina() {
        return this.Bosnia_and_Herzegovina;
    }

    public Double getBotswana() {
        return this.Botswana;
    }

    public Double getBrazil() {
        return this.Brazil;
    }

    public Double getBritish_Virgin_Islands() {
        return this.British_Virgin_Islands;
    }

    public Double getBrunei_Darussalam() {
        return this.Brunei_Darussalam;
    }

    public Double getBulgaria() {
        return this.Bulgaria;
    }

    public Double getBurkina_Faso() {
        return this.Burkina_Faso;
    }

    public Double getBurundi() {
        return this.Burundi;
    }

    public Double getCambodia() {
        return this.Cambodia;
    }

    public Double getCanada() {
        return this.Canada;
    }

    public Double getCape_Verde() {
        return this.Cape_Verde;
    }

    public Double getCentral_African_Republic() {
        return this.Central_African_Republic;
    }

    public Double getChad() {
        return this.Chad;
    }

    public Double getChile() {
        return this.Chile;
    }

    public Double getChina() {
        return this.China;
    }

    public Double getColombia() {
        return this.Colombia;
    }

    public Double getComoros() {
        return this.Comoros;
    }

    public Double getCongo() {
        return this.Congo;
    }

    public Double getCook_Islands() {
        return this.Cook_Islands;
    }

    public Double getCosta_Rica() {
        return this.Costa_Rica;
    }

/*     public Double getCote_dIvoire() {
        return this.Cote_dIvoire;
    } */

    public Double getCroatia() {
        return this.Croatia;
    }

    public Double getCuba() {
        return this.Cuba;
    }

    public Double getCuraçao() {
        return this.Curaçao;
    }

    public Double getCyprus() {
        return this.Cyprus;
    }

    public Double getCzech_Republic() {
        return this.Czech_Republic;
    }

    public Double getNorth_Korea() {
        return this.North_Korea;
    }

    public Double getDemocratic_Republic_of_the_Congo() {
        return this.Democratic_Republic_of_the_Congo;
    }

    public Double getDenmark() {
        return this.Denmark;
    }

    public Double getDjibouti() {
        return this.Djibouti;
    }

    public Double getDominica() {
        return this.Dominica;
    }

    public Double getDominican_Republic() {
        return this.Dominican_Republic;
    }

    public Double getEcuador() {
        return this.Ecuador;
    }

    public Double getEgypt() {
        return this.Egypt;
    }

    public Double getEl_Salvador() {
        return this.El_Salvador;
    }

    public Double getEquatorial_Guinea() {
        return this.Equatorial_Guinea;
    }

    public Double getEritrea() {
        return this.Eritrea;
    }

    public Double getEstonia() {
        return this.Estonia;
    }

    public Double getEthiopia() {
        return this.Ethiopia;
    }

    public Double getFaeroe_Islands() {
        return this.Faeroe_Islands;
    }

    public Double getMicronesia() {
        return this.Micronesia;
    }

    public Double getFiji() {
        return this.Fiji;
    }

    public Double getFinland() {
        return this.Finland;
    }

    public Double getFrance() {
        return this.France;
    }

    public Double getFrench_Guiana() {
        return this.French_Guiana;
    }

    public Double getFrench_Polynesia() {
        return this.French_Polynesia;
    }

    public Double getGabon() {
        return this.Gabon;
    }

    public Double getGambia() {
        return this.Gambia;
    }

    public Double getGeorgia() {
        return this.Georgia;
    }

    public Double getGermany() {
        return this.Germany;
    }

    public Double getGhana() {
        return this.Ghana;
    }

    public Double getGreece() {
        return this.Greece;
    }

    public Double getGreenland() {
        return this.Greenland;
    }

    public Double getGrenada() {
        return this.Grenada;
    }

    public Double getGuadeloupe() {
        return this.Guadeloupe;
    }

    public Double getGuatemala() {
        return this.Guatemala;
    }

    public Double getGuinea() {
        return this.Guinea;
    }

    public Double getGuinea_Bissau() {
        return this.Guinea_Bissau;
    }

    public Double getGuyana() {
        return this.Guyana;
    }

    public Double getHaiti() {
        return this.Haiti;
    }

    public Double getHonduras() {
        return this.Honduras;
    }

    public Double getHong_Kong() {
        return this.Hong_Kong;
    }

    public Double getHungary() {
        return this.Hungary;
    }

    public Double getIceland() {
        return this.Iceland;
    }

    public Double getIndia() {
        return this.India;
    }

    public Double getIndonesia() {
        return this.Indonesia;
    }

    public Double getIraq() {
        return this.Iraq;
    }

    public Double getIreland() {
        return this.Ireland;
    }

    public Double getIran() {
        return this.Iran;
    }

    public Double getIsrael() {
        return this.Israel;
    }

    public Double getItaly() {
        return this.Italy;
    }

    public Double getJamaica() {
        return this.Jamaica;
    }

    public Double getJapan() {
        return this.Japan;
    }

    public Double getJordan() {
        return this.Jordan;
    }

    public Double getKazakhstan() {
        return this.Kazakhstan;
    }

    public Double getKenya() {
        return this.Kenya;
    }

    public Double getKiribati() {
        return this.Kiribati;
    }

    public Double getKosovo() {
        return this.Kosovo;
    }

    public Double getKuwait() {
        return this.Kuwait;
    }

    public Double getKyrgyzstan() {
        return this.Kyrgyzstan;
    }

    public Double getLaos() {
        return this.Laos;
    }

    public Double getLatvia() {
        return this.Latvia;
    }

    public Double getLebanon() {
        return this.Lebanon;
    }

    public Double getLesotho() {
        return this.Lesotho;
    }

    public Double getLiberia() {
        return this.Liberia;
    }

    public Double getLibya() {
        return this.Libya;
    }

    public Double getLiechtenstein() {
        return this.Liechtenstein;
    }

    public Double getLithuania() {
        return this.Lithuania;
    }

    public Double getLuxembourg() {
        return this.Luxembourg;
    }

    public Double getMacao() {
        return this.Macao;
    }

    public Double getNorth_Macedonia() {
        return this.North_Macedonia;
    }

    public Double getMadagascar() {
        return this.Madagascar;
    }

    public Double getMalawi() {
        return this.Malawi;
    }

    public Double getMalaysia() {
        return this.Malaysia;
    }

    public Double getMaldives() {
        return this.Maldives;
    }

    public Double getMali() {
        return this.Mali;
    }

    public Double getMalta() {
        return this.Malta;
    }

    public Double getMarshall_Islands() {
        return this.Marshall_Islands;
    }

    public Double getMartinique() {
        return this.Martinique;
    }

    public Double getMauritania() {
        return this.Mauritania;
    }

    public Double getMauritius() {
        return this.Mauritius;
    }

    public Double getMayotte() {
        return this.Mayotte;
    }

    public Double getMexico() {
        return this.Mexico;
    }

    public Double getMongolia() {
        return this.Mongolia;
    }

    public Double getMontenegro() {
        return this.Montenegro;
    }

    public Double getMontserrat() {
        return this.Montserrat;
    }

    public Double getMorocco() {
        return this.Morocco;
    }

    public Double getMozambique() {
        return this.Mozambique;
    }

    public Double getMyanmar() {
        return this.Myanmar;
    }

    public Double getNamibia() {
        return this.Namibia;
    }

    public Double getNauru() {
        return this.Nauru;
    }

    public Double getNepal() {
        return this.Nepal;
    }

    public Double getNetherlands() {
        return this.Netherlands;
    }

    public Double getNew_Caledonia() {
        return this.New_Caledonia;
    }

    public Double getNew_Zealand() {
        return this.New_Zealand;
    }

    public Double getNicaragua() {
        return this.Nicaragua;
    }

    public Double getNiger() {
        return this.Niger;
    }

    public Double getNigeria() {
        return this.Nigeria;
    }

    public Double getNiue() {
        return this.Niue;
    }

    public Double getNorway() {
        return this.Norway;
    }

    public Double getOccupied_Palestinian_Territory() {
        return this.Occupied_Palestinian_Territory;
    }

    public Double getOman() {
        return this.Oman;
    }

    public Double getPakistan() {
        return this.Pakistan;
    }

    public Double getPalau() {
        return this.Palau;
    }

    public Double getPanama() {
        return this.Panama;
    }

    public Double getPapua_New_Guinea() {
        return this.Papua_New_Guinea;
    }

    public Double getParaguay() {
        return this.Paraguay;
    }

    public Double getPeru() {
        return this.Peru;
    }

    public Double getPhilippines() {
        return this.Philippines;
    }

    public Double getBolivia() {
        return this.Bolivia;
    }

    public Double getPoland() {
        return this.Poland;
    }

    public Double getPortugal() {
        return this.Portugal;
    }

    public Double getQatar() {
        return this.Qatar;
    }

    public Double getCameroon() {
        return this.Cameroon;
    }

    public Double getSouth_Korea() {
        return this.South_Korea;
    }

    public Double getMoldova() {
        return this.Moldova;
    }

    public Double getSouth_Sudan() {
        return this.South_Sudan;
    }

    public Double getSudan() {
        return this.Sudan;
    }

    public Double getRéunion() {
        return this.Réunion;
    }

    public Double getRomania() {
        return this.Romania;
    }

    public Double getRussian_Federation() {
        return this.Russian_Federation;
    }

    public Double getRwanda() {
        return this.Rwanda;
    }

    public Double getSaint_Helena() {
        return this.Saint_Helena;
    }

    public Double getSaint_Lucia() {
        return this.Saint_Lucia;
    }

    public Double getSint_Maarten_Dutch_part() {
        return this.Sint_Maarten_Dutch_part;
    }

    public Double getSamoa() {
        return this.Samoa;
    }

    public Double getSao_Tome_and_Principe() {
        return this.Sao_Tome_and_Principe;
    }

    public Double getSaudi_Arabia() {
        return this.Saudi_Arabia;
    }

    public Double getSenegal() {
        return this.Senegal;
    }

    public Double getSerbia() {
        return this.Serbia;
    }

    public Double getSeychelles() {
        return this.Seychelles;
    }

    public Double getSierra_Leone() {
        return this.Sierra_Leone;
    }

    public Double getSingapore() {
        return this.Singapore;
    }

    public Double getSlovakia() {
        return this.Slovakia;
    }

    public Double getSlovenia() {
        return this.Slovenia;
    }

    public Double getSolomon_Islands() {
        return this.Solomon_Islands;
    }

    public Double getSomalia() {
        return this.Somalia;
    }

    public Double getSouth_Africa() {
        return this.South_Africa;
    }

    public Double getSpain() {
        return this.Spain;
    }

    public Double getSri_Lanka() {
        return this.Sri_Lanka;
    }

    public Double getSaint_Kitts_and_Nevis() {
        return this.Saint_Kitts_and_Nevis;
    }

    public Double getSaint_Pierre_and_Miquelon() {
        return this.Saint_Pierre_and_Miquelon;
    }

    public Double getSaint_Vincent_and_the_Grenadines() {
        return this.Saint_Vincent_and_the_Grenadines;
    }

    public Double getSuriname() {
        return this.Suriname;
    }

    public Double getSwaziland() {
        return this.Swaziland;
    }

    public Double getSweden() {
        return this.Sweden;
    }

    public Double getSwitzerland() {
        return this.Switzerland;
    }

    public Double getSyria() {
        return this.Syria;
    }

    public Double getTaiwan() {
        return this.Taiwan;
    }

    public Double getTajikistan() {
        return this.Tajikistan;
    }

    public Double getThailand() {
        return this.Thailand;
    }

    public Double getTimor_Leste() {
        return this.Timor_Leste;
    }

    public Double getTogo() {
        return this.Togo;
    }

    public Double getTonga() {
        return this.Tonga;
    }

    public Double getTrinidad_and_Tobago() {
        return this.Trinidad_and_Tobago;
    }

    public Double getTunisia() {
        return this.Tunisia;
    }

    public Double getTurkey() {
        return this.Turkey;
    }

    public Double getTurkmenistan() {
        return this.Turkmenistan;
    }

    public Double getTurks_and_Caicos_Islands() {
        return this.Turks_and_Caicos_Islands;
    }

    public Double getTuvalu() {
        return this.Tuvalu;
    }

    public Double getUganda() {
        return this.Uganda;
    }

    public Double getUkraine() {
        return this.Ukraine;
    }

    public Double getUnited_Arab_Emirates() {
        return this.United_Arab_Emirates;
    }

    public Double getUnited_Kingdom() {
        return this.United_Kingdom;
    }

    public Double getTanzania() {
        return this.Tanzania;
    }

    public Double getUSA() {
        return this.USA;
    }

    public Double getUruguay() {
        return this.Uruguay;
    }

    public Double getUzbekistan() {
        return this.Uzbekistan;
    }

    public Double getVanuatu() {
        return this.Vanuatu;
    }

    public Double getVenezuela() {
        return this.Venezuela;
    }

    public Double getViet_Nam() {
        return this.Viet_Nam;
    }

    public Double getWallis_and_Futuna_Islands() {
        return this.Wallis_and_Futuna_Islands;
    }

    public Double getYemen() {
        return this.Yemen;
    }

    public Double getZambia() {
        return this.Zambia;
    }

    public Double getZimbabwe() {
        return this.Zimbabwe;
    }

    public Double getKP_Annex_B() {
        return this.KP_Annex_B;
    }

    public Double getNon_KP_Annex_B() {
        return this.Non_KP_Annex_B;
    }

    public Double getOECD() {
        return this.OECD;
    }

    public Double getNon_OECD() {
        return this.Non_OECD;
    }

    public Double getEU27() {
        return this.EU27;
    }

    public Double getAfrica() {
        return this.Africa;
    }

    public Double getAsia() {
        return this.Asia;
    }

    public Double getCentral_America() {
        return this.Central_America;
    }

    public Double getEurope() {
        return this.Europe;
    }

    public Double getMiddle_East() {
        return this.Middle_East;
    }

    public Double getNorth_America() {
        return this.North_America;
    }

    public Double getOceania() {
        return this.Oceania;
    }

    public Double getSouth_America() {
        return this.South_America;
    }

    public Double getBunkers() {
        return this.Bunkers;
    }

    public Double getStatistical_Difference() {
        return this.Statistical_Difference;
    }

    public Double getWorld() {
        return this.World;
    }

    
}