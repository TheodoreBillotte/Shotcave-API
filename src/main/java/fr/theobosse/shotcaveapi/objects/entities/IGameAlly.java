package fr.theobosse.shotcaveapi.objects.entities;

public interface IGameAlly extends IGameLivingEntity {

       /////////////////////
     //     GETTERS     //
    /////////////////////

    public IGamePlayer getSummoner();

       /////////////////////
     //     SETTERS     //
    /////////////////////

    public void setSummoner(IGamePlayer summoner);

}
