package efs.task.collections.data;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import efs.task.collections.entity.Hero;
import efs.task.collections.entity.Town;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class DataProvider {

    public static final String DATA_SEPARATOR = ",";

    // TODO Utwórz listę miast na podstawie tablicy Data.baseTownsArray.
    //  Tablica zawiera String zawierający nazwę miasta oraz dwie klasy bohatera związane z tym miastem oddzielone przecinkami.
    //  Korzystając z funkcji split() oraz stałej DATA_SEPARATOR utwórz listę obiektów klasy efs.task.collections.entities.Town.
    //  Funkcja zwraca listę obiektów typu Town ze wszystkimi dziewięcioma podstawowymi miastami.
    public List<Town> getTownsList() {
        List<Town> townlist = new ArrayList<>();
        for(String element : Data.baseTownsArray){
            String[] value = element.split(DATA_SEPARATOR);
            Town town = new Town(value[0].trim(),Arrays.asList(value[1].trim(),value[2].trim()));
            townlist.add(town);
        }
        return townlist;
    }

    //TODO Analogicznie do getTownsList utwórz listę miast na podstawie tablicy Data.DLCTownsArray
    public List<Town> getDLCTownsList() {
        List<Town> dlctownlist = new ArrayList<>();
        for(String element : Data.dlcTownsArray){
            String[] value = element.split(DATA_SEPARATOR);
            Town town = new Town(value[0].trim(),Arrays.asList(value[1].trim(),value[2].trim()));
            dlctownlist.add(town);
        }
        return dlctownlist;
    }

    //TODO Na podstawie tablicy Data.baseCharactersArray utworzyć listę bohaterów dostępnych w grze.
    // Tablica Data.baseCharactersArray zawiera oddzielone przecinkiem imie bohatera, klasę bohatera.
    // Korzystając z funkcji split() oraz DATA_SEPARATOR utwórz listę unikalnych obiektów efs.task.collections.entities.Hero.
    // UWAGA w Data.baseCharactersArray niektórzy bohaterowie powtarzają się, do porównania bohaterów używamy zarówno imie jak i jego klasę;
    public Set<Hero> getHeroesSet() {
        Set<Hero> heroset = new HashSet<>();
        for(String element : Data.baseCharactersArray){
            String[] value = element.split(DATA_SEPARATOR);
            Hero hero = new Hero(value[0].trim(),value[1].trim());
            heroset.add(hero);
        }
        return heroset;
    }

    //TODO Analogicznie do getHeroesSet utwórz listę bohaterów na podstawie tablicy Data.DLCCharactersArray
    public Set<Hero> getDLCHeroesSet() {
        Set<Hero> dlcheroset = new HashSet<>();
        for(String element : Data.dlcCharactersArray){
            String[] value = element.split(DATA_SEPARATOR);
            Hero hero = new Hero(value[0].trim(),value[1].trim());
            dlcheroset.add(hero);
        }
        return dlcheroset;
    }
}
