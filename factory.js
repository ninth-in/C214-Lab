//classe
class nomePessoa{
    constructor(primeiroNome,segundoNome){
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
    }

    getNome(){
        return this.primeiroNome, this.segundoNome;
    } 
}


//Factory
function createPerson(firstName, lastName) {
    return {
      firstName: firstName,
      lastName: lastName,
      getFullName() {
        return firstName + ' ' + lastName;
      },
    };
  }
  
  let person1 = createPerson('John', 'Doe');
  let pessoa = new nomePessoa('Jane', 'Doe');
  
  console.log(person1.getFullName());
  console.log(pessoa);