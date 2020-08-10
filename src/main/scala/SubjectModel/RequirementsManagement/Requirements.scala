package SubjectModel.RequirementsManagement



/** ==class Requirements==
* @author Dynamic
* Класс, который инкапсулирует основные параметры для каждого вида требования
*   @param requirementDescription описание требования
  * @param requirementId  индификатор требования
  * @param timeOfClaim дата внесения требования
  * @param staterequiremen состояние требования
**/
 class Requirements (

                          var requirementId: Long,
                          var requirementDescription: String,
                          var timeOfClaim: String,
                          var staterequiremen: String

                        )




